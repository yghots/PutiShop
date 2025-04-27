package org.example.putishop.dto.Carrito;

import lombok.Builder;
import lombok.Data;
import org.example.putishop.entity.ItemCarrito;
import org.example.putishop.entity.Usuario;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class CarritoResponseDTO {
    private Long id;
    private Usuario usuario;
    private List<ItemCarrito> items = new ArrayList<>();
    private BigDecimal total;
    private LocalDateTime fechaCreacion;
}
