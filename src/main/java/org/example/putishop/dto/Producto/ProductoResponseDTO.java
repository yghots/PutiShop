package org.example.putishop.dto.Producto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductoResponseDTO {
    private Long id;
    private String codigoProducto;
    private String categoria;
    private String nombre;
    private Integer stock;
    private BigDecimal precio;
    private boolean estado;
}
