package org.example.putishop.mapper;

import org.example.putishop.dto.Carrito.CarritoRequestDTO;
import org.example.putishop.dto.Carrito.CarritoResponseDTO;
import org.example.putishop.entity.Carrito;
import org.springframework.stereotype.Component;

@Component
public class CarritoMapper {

    public CarritoResponseDTO toDTO (Carrito carrito) {
        return CarritoResponseDTO.builder()
                .id(carrito.getId())
                .usuario(carrito.getUsuario())
                .items(carrito.getItems())
                .total(carrito.getTotal())
                .build();
    }

    public Carrito toEntity (CarritoRequestDTO carritoRequestDTO) {
        Carrito carrito = new Carrito();
        carrito.setUsuario(carritoRequestDTO.getUsuario());
        carrito.setItems(carritoRequestDTO.getItems());
        carrito.setTotal(carritoRequestDTO.getTotal());
        return carrito;
    }
}
