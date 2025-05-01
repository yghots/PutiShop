package org.example.putishop.service;

import org.example.putishop.dto.DetalleVenta.DetalleVentaRequestDTO;
import org.example.putishop.dto.DetalleVenta.DetalleVentaResponseDTO;

import java.util.List;

public interface DetalleVentaService {
    List<DetalleVentaResponseDTO> listarDetalleVentas();
    DetalleVentaResponseDTO crearDetalleVenta(DetalleVentaRequestDTO detalleVenta);
    DetalleVentaResponseDTO modificarDetalleVenta(Long id, DetalleVentaRequestDTO detalleVenta);
    void eliminarDetalleVenta(Long id);
}
