package org.example.putishop.dto.DetalleVenta;

import lombok.Builder;
import lombok.Data;
import org.example.putishop.entity.Producto;
import org.example.putishop.entity.Venta;

import java.math.BigDecimal;

@Data
@Builder
public class DetalleVentaResponseDTO {
    private Long id;
    private Venta venta;
    private Producto producto;
    private Integer cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subtotal;
}
