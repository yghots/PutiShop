package org.example.putishop.dto.ItemCarrito;

import lombok.Builder;
import lombok.Data;
import org.example.putishop.entity.Carrito;
import org.example.putishop.entity.Producto;

import java.math.BigDecimal;


@Data
@Builder
public class ItemCarritoResponseDTO  {
    private Long id;
    private Carrito carrito;
    private Producto producto;
    private Integer cantidad;
    private BigDecimal subtotal;
}
