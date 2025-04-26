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
@Table(name = "DETALLE_VENTAS")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CODIGO_VENTA", referencedColumnName = "CODIGO_VENTA")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "CODIGO_PRODUCTO", referencedColumnName = "CODIGO_PRODUCTO")
    private Producto producto;

    private Integer cantidad;

    @Column(name = "PRECIO_UNITARIO", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    @Column(precision = 10, scale = 2)
    private BigDecimal subtotal;

    // Getters, setters, constructores
    @PrePersist
    public void calcularSubtotal() {
        if (precioUnitario != null && cantidad != null) {
            subtotal = precioUnitario.multiply(BigDecimal.valueOf(cantidad));
        }
    }
}