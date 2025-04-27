package org.example.putishop.dto.Carrito;

import lombok.Data;
import org.example.putishop.entity.ItemCarrito;
import org.example.putishop.entity.Usuario;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class CarritoRequestDTO {
    private Usuario usuario;
    private List<ItemCarrito> items = new ArrayList<>();
    private BigDecimal total;
    private LocalDateTime fechaCreacion;
}
