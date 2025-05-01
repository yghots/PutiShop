package org.example.putishop.mapper;

import org.example.putishop.dto.Venta.VentaRequestDTO;
import org.example.putishop.dto.Venta.VentaResponseDTO;
import org.example.putishop.entity.Venta;
import org.springframework.stereotype.Component;

@Component
public class VentaMapper {
    public VentaResponseDTO toDTO(Venta venta) {
        return VentaResponseDTO.builder()
                .id(venta.getId())
                .usuario(venta.getUsuario())
                .fecha(venta.getFecha())
                .total(venta.getTotal())
                .estado(venta.isEstado())
                .detalles(venta.getDetalles())
                .build();
    }

    public Venta toEntity(VentaRequestDTO ventaRequestDTO) {
        Venta venta = new Venta();
        venta.setUsuario(ventaRequestDTO.getUsuario());
        venta.setFecha(ventaRequestDTO.getFecha());
        venta.setTotal(ventaRequestDTO.getTotal());
        venta.setEstado(ventaRequestDTO.isEstado());
        venta.setDetalles(ventaRequestDTO.getDetalles());
        return venta;
    }
}
