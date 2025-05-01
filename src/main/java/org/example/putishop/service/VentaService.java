package org.example.putishop.service;

import org.example.putishop.dto.Venta.VentaRequestDTO;
import org.example.putishop.dto.Venta.VentaResponseDTO;
import org.example.putishop.entity.Venta;

import java.util.List;

public interface VentaService {
    List<VentaResponseDTO> listarVentas();
    VentaResponseDTO crearVenta(VentaRequestDTO venta);
    VentaResponseDTO ModificarVenta(Long id, VentaRequestDTO venta);
    void eliminarVenta(Long id);
}
