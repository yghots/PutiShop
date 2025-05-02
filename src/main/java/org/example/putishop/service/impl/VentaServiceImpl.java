package org.example.putishop.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.Venta.VentaRequestDTO;
import org.example.putishop.dto.Venta.VentaResponseDTO;
import org.example.putishop.entity.Venta;
import org.example.putishop.mapper.VentaMapper;
import org.example.putishop.repository.VentaRepository;
import org.example.putishop.service.VentaService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VentaServiceImpl implements VentaService {
    private final VentaRepository ventaRepository;
    private final VentaMapper ventaMapper;

    @Override
    public List<VentaResponseDTO> listarVentas() {
        return ventaRepository.findAll().stream()
                .map(ventaMapper::toDTO).toList();
    }
    @Override
    public VentaResponseDTO crearVenta(VentaRequestDTO ventaDTO){
        Venta venta = ventaMapper.toEntity(ventaDTO);
        return ventaMapper.toDTO(ventaRepository.save(venta));
    }
    @Override
    public VentaResponseDTO ModificarVenta(Long id, VentaRequestDTO ventaDTO){
        Venta venta = ventaMapper.toEntity(ventaDTO);
        venta.setCodigoVenta(ventaDTO.getCodigVenta());
        venta.setUsuario(ventaDTO.getUsuario());
        venta.setFecha(ventaDTO.getFecha());
        venta.setTotal(ventaDTO.getTotal());
        venta.setEstado(ventaDTO.isEstado());
        venta.setDetalles(ventaDTO.getDetalles());
        return ventaMapper.toDTO(ventaRepository.save(venta));
    }
    @Override
    public void eliminarVenta(Long id){
        ventaRepository.deleteById(id);
    }

}
