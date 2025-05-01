package org.example.putishop.dto.Producto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductoRequestDTO {
    private String codigoProducto;
    private String categoria;
    private String nombre;
    private Integer stock;
    private BigDecimal precio;
    private boolean estado;
}

