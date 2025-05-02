package org.example.putishop.mapper;

import org.example.putishop.dto.ItemCarrito.ItemCarritoRequestDTO;
import org.example.putishop.dto.ItemCarrito.ItemCarritoResponseDTO;
import org.example.putishop.entity.ItemCarrito;
import org.springframework.stereotype.Component;

@Component
public class ItemCarritoMapper {
    public ItemCarritoResponseDTO toDTO(ItemCarrito itemCarrito) {
        return ItemCarritoResponseDTO.builder()
                .carrito(itemCarrito.getCarrito())
                .producto(itemCarrito.getProducto())
                .cantidad(itemCarrito.getCantidad())
                .subtotal(itemCarrito.getSubtotal())
                .build();
    }
    public ItemCarrito toEntity(ItemCarritoRequestDTO itemCarrito) {
        ItemCarrito itemCarritoEntity = new ItemCarrito();
        itemCarritoEntity.setCarrito(itemCarrito.getCarrito());
        itemCarritoEntity.setProducto(itemCarrito.getProducto());
        itemCarritoEntity.setCantidad(itemCarrito.getCantidad());
        itemCarritoEntity.setSubtotal(itemCarrito.getSubtotal());
        return itemCarritoEntity;

    }
}
