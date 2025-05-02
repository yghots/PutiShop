package org.example.putishop.service;

import org.example.putishop.dto.Carrito.CarritoRequestDTO;
import org.example.putishop.dto.Carrito.CarritoResponseDTO;
import org.example.putishop.dto.ItemCarrito.ItemCarritoRequestDTO;
import org.example.putishop.dto.ItemCarrito.ItemCarritoResponseDTO;

import java.util.List;

public interface CarritoService {
    List<CarritoResponseDTO> listarCarrito();
    CarritoResponseDTO crearCarrito(CarritoRequestDTO carritoDTO);
    CarritoResponseDTO modificarCarrito(Long id , CarritoRequestDTO carritoDTO);
    void eliminarCarrito(Long id);
}
