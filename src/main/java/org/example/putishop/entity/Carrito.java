package org.example.putishop.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Entidad Carrito
@Entity
@Table(name = "CARRITO")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "CODIGO_USUARIO", referencedColumnName = "CODIGO_USUARIO")
    private Usuario usuario;

    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemCarrito> items = new ArrayList<>();

    @Column(precision = 10, scale = 2)
    private BigDecimal total = BigDecimal.ZERO;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;
}
