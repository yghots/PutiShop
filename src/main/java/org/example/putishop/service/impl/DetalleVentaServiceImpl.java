package org.example.putishop.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.DetalleVenta.DetalleVentaRequestDTO;
import org.example.putishop.dto.DetalleVenta.DetalleVentaResponseDTO;
import org.example.putishop.entity.DetalleVenta;
import org.example.putishop.mapper.DetalleVentaMapper;
import org.example.putishop.repository.DetalleVentaRepository;
import org.example.putishop.service.DetalleVentaService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {
    private final DetalleVentaRepository detalleVentaRepository;
    private final DetalleVentaMapper detalleVentaMapper;
    private final DetalleVentaService detalleVentaService;

    @Override
    public List<DetalleVentaResponseDTO> listarDetalleVentas(){
        return detalleVentaRepository.findAll().stream()
                .map(detalleVentaMapper::toDTO).toList();
    }
    @Override
    public DetalleVentaResponseDTO crearDetalleVenta(DetalleVentaRequestDTO detalleVenta){
        DetalleVenta detalleVentaEntity = detalleVentaMapper.toEntity(detalleVenta);
        DetalleVenta save = detalleVentaRepository.save(detalleVentaEntity);
        return detalleVentaMapper.toDTO(save);
    }
    @Override
    public DetalleVentaResponseDTO modificarDetalleVenta(Long id, DetalleVentaRequestDTO detalleVentaResponseDTO){
        DetalleVenta detalleVentaExistente= detalleVentaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Detalle no encontrado con ID: " + id));
        detalleVentaExistente.setVenta(detalleVentaResponseDTO.getVenta());
        detalleVentaExistente.setProducto(detalleVentaResponseDTO.getProducto());
        detalleVentaExistente.setCantidad(detalleVentaResponseDTO.getCantidad());
        detalleVentaExistente.setPrecioUnitario(detalleVentaResponseDTO.getPrecioUnitario());
        detalleVentaExistente.setSubtotal(detalleVentaResponseDTO.getSubtotal());

        DetalleVenta save = detalleVentaRepository.save(detalleVentaExistente);
        return detalleVentaMapper.toDTO(save);
    }
    @Override
    public void eliminarDetalleVenta(Long id){
        detalleVentaRepository.deleteById(id);
    }

}
