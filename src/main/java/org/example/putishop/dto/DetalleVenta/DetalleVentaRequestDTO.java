package org.example.putishop.dto.DetalleVenta;

import lombok.Data;
import org.example.putishop.entity.Producto;
import org.example.putishop.entity.Venta;

import java.math.BigDecimal;

@Data
public class DetalleVentaRequestDTO {
    private Venta venta;
    private Producto producto;
    private Integer cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subtotal;
}
