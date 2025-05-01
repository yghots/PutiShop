package org.example.putishop.mapper;

import org.example.putishop.dto.DetalleVenta.DetalleVentaRequestDTO;
import org.example.putishop.dto.DetalleVenta.DetalleVentaResponseDTO;
import org.example.putishop.entity.DetalleVenta;
import org.springframework.stereotype.Component;

@Component
public class DetalleVentaMapper {

    public DetalleVentaResponseDTO toDTO(DetalleVenta detalleVenta) {
        return DetalleVentaResponseDTO.builder()
                .id(detalleVenta.getId())
                .venta(detalleVenta.getVenta())
                .producto(detalleVenta.getProducto())
                .cantidad(detalleVenta.getCantidad())
                .precioUnitario(detalleVenta.getPrecioUnitario())
                .subtotal(detalleVenta.getSubtotal())
                .build();
    }
    public  DetalleVenta toEntity(DetalleVentaRequestDTO detalleVentaRequestDTO) {
        DetalleVenta detalleVenta = new DetalleVenta();
        detalleVenta.setVenta(detalleVentaRequestDTO.getVenta());
        detalleVenta.setProducto(detalleVentaRequestDTO.getProducto());
        detalleVenta.setCantidad(detalleVentaRequestDTO.getCantidad());
        detalleVenta.setPrecioUnitario(detalleVentaRequestDTO.getPrecioUnitario());
        detalleVenta.setSubtotal(detalleVentaRequestDTO.getSubtotal());
        return detalleVenta;
    }
}
