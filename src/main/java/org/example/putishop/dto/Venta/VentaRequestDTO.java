package org.example.putishop.dto.Venta;

import lombok.Data;
import org.example.putishop.entity.DetalleVenta;
import org.example.putishop.entity.Usuario;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data
public class VentaRequestDTO {
    private String codigVenta;
    private Usuario usuario;
    private LocalDateTime fecha;
    private BigDecimal total;
    private boolean estado;
    private List<DetalleVenta> detalles = new ArrayList<>();
}
