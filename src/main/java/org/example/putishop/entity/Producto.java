package org.example.putishop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCTOS")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_PRODUCTO", unique = true, nullable = false)
    private String codigoProducto;

    @Column(name = "CATEGORIA_PRODUCTO")
    private String categoria;

    @Column(name = "NOMBRE_PRODUCTO")
    private String nombre;

    private Integer stock;

    @Column(precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(nullable = false)
    private boolean estado;
}
