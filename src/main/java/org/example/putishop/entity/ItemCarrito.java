package org.example.putishop.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;


// Entidad ItemCarrito
@Data
@Entity
@Table(name = "ITEMS_CARRITO")
public class ItemCarrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARRITO_ID")
    private Carrito carrito;

    @ManyToOne
    @JoinColumn(name = "CODIGO_PRODUCTO", referencedColumnName = "CODIGO_PRODUCTO")
    private Producto producto;

    private Integer cantidad;

    @Column(precision = 10, scale = 2)
    private BigDecimal subtotal;

    @PrePersist
    @PreUpdate
    public void calcularSubtotal() {
        if (producto != null && producto.getPrecio() != null && cantidad != null) {
            subtotal = producto.getPrecio().multiply(BigDecimal.valueOf(cantidad));
        }
    }
}