package org.example.putishop.service;

import org.example.putishop.dto.ItemCarrito.ItemCarritoRequestDTO;
import org.example.putishop.dto.ItemCarrito.ItemCarritoResponseDTO;

import java.util.List;

public interface CarritoService {
    List<ItemCarritoResponseDTO> listarItemCarrito();
    ItemCarritoResponseDTO crearItemCarrito(ItemCarritoRequestDTO itemCarrito);
    ItemCarritoResponseDTO modificarItemCarrito(Long id ,ItemCarritoRequestDTO itemCarrito);
    void eliminarItemCarrito(Long id);
}
