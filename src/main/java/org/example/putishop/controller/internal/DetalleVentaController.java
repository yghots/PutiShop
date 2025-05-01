package org.example.putishop.controller.internal;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.DetalleVenta.DetalleVentaRequestDTO;
import org.example.putishop.dto.DetalleVenta.DetalleVentaResponseDTO;
import org.example.putishop.dto.ItemCarrito.ItemCarritoResponseDTO;
import org.example.putishop.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/detalleventa")
public class DetalleVentaController {

    @Autowired
    private final DetalleVentaService detalleVentaService;

    @GetMapping
    public List<DetalleVentaResponseDTO> listarCarritos() {
        return detalleVentaService.listarDetalleVentas();
    }
    @PostMapping
    public DetalleVentaResponseDTO crearCarrito(@RequestBody DetalleVentaRequestDTO dto) {
        return detalleVentaService.crearDetalleVenta(dto);
    }
    @PutMapping
    public DetalleVentaResponseDTO modificarCarrito( Long id ,DetalleVentaRequestDTO dto) {
        return detalleVentaService.modificarDetalleVenta(id, dto);
    }
    @DeleteMapping
    public void eliminarCarrito(Long id) {
         detalleVentaService.eliminarDetalleVenta(id);
    }
}
