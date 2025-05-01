package org.example.putishop.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.Venta.VentaRequestDTO;
import org.example.putishop.dto.Venta.VentaResponseDTO;
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

    }
    @Override
    public VentaResponseDTO ModificarVenta(Long id, VentaRequestDTO venta){
    }
    @Override
    public void eliminarVenta(Long id){
        ventaRepository.deleteById(id);
    }



}
