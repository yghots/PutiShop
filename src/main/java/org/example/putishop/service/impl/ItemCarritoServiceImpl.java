package org.example.putishop.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.ItemCarrito.ItemCarritoResponseDTO;
import org.example.putishop.mapper.CarritoMapper;
import org.example.putishop.repository.ItemCarritoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemCarritoServiceImpl {
    private final ItemCarritoRepository itemCarritoRepository;
    private final CarritoMapper carritoMapper;


    //public List<ItemCarritoResponseDTO> listarItemCarrito
}
