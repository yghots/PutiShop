package org.example.putishop.dto.ItemCarrito;

import lombok.Data;
import org.example.putishop.entity.Carrito;
import org.example.putishop.entity.Producto;

import java.math.BigDecimal;

@Data
public class ItemCarritoRequestDTO {
    private Carrito carrito;
    private Producto producto;
    private Integer cantidad;
    private BigDecimal subtotal;
}
