package org.example.putishop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VENTAS")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_VENTA", unique = true, nullable = false)
    private String codigoVenta;

    @ManyToOne
    @JoinColumn(name = "CODIGO_USUARIO", referencedColumnName = "CODIGO_USUARIO")
    private Usuario usuario;

    @CreationTimestamp
    private LocalDateTime fecha;

    @Column(precision = 10, scale = 2)
    private BigDecimal total = BigDecimal.ZERO;

    @Column(nullable = false)
    private boolean estado;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleVenta> detalles = new ArrayList<>();

}