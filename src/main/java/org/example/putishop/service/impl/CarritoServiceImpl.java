package org.example.putishop.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.Carrito.CarritoRequestDTO;
import org.example.putishop.dto.Carrito.CarritoResponseDTO;
import org.example.putishop.dto.ItemCarrito.ItemCarritoRequestDTO;
import org.example.putishop.dto.ItemCarrito.ItemCarritoResponseDTO;
import org.example.putishop.entity.Carrito;
import org.example.putishop.mapper.CarritoMapper;
import org.example.putishop.repository.CarritoRepository;
import org.example.putishop.service.CarritoService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarritoServiceImpl implements CarritoService {

    private final CarritoRepository carritoRepository;
    private final CarritoMapper carritoMapper;

    @Override
    public List<CarritoResponseDTO> listarCarrito()
    {
        return carritoRepository.findAll().stream()
                .map(carritoMapper::toDTO)
                .toList();
    }

    @Override
    public CarritoResponseDTO crearCarrito(CarritoRequestDTO carritoDTO) {
        Carrito carrito = carritoMapper.toEntity(carritoDTO);
        Carrito SavedCarrito = carritoRepository.save(carrito);

        return carritoMapper.toDTO(SavedCarrito);
    }

    @Override
    public CarritoResponseDTO modificarCarrito(Long id, CarritoRequestDTO carritoDTO) {
        Carrito carrito = carritoRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Carrito no encontrado"));

        carrito.setUsuario(carritoDTO.getUsuario());
        carrito.setItems(carritoDTO.getItems());
        carrito.setTotal(carritoDTO.getTotal());
        carrito.setFechaCreacion(carritoDTO.getFechaCreacion());
        Carrito SavedCarrito = carritoRepository.save(carrito);

        return carritoMapper.toDTO(SavedCarrito);
    }

    @Override
    public void eliminarCarrito(Long id) {
        carritoRepository.deleteById(id);
    }
}
