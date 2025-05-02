package org.example.putishop.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.ItemCarrito.ItemCarritoRequestDTO;
import org.example.putishop.dto.ItemCarrito.ItemCarritoResponseDTO;
import org.example.putishop.entity.ItemCarrito;
import org.example.putishop.entity.Producto;
import org.example.putishop.mapper.CarritoMapper;
import org.example.putishop.mapper.ItemCarritoMapper;
import org.example.putishop.repository.ItemCarritoRepository;
import org.example.putishop.service.ItemCarritoService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemCarritoServiceImpl implements ItemCarritoService {
    private final ItemCarritoRepository itemCarritoRepository;
    private final ItemCarritoMapper itemCarritoMapper;


    @Override
    public List<ItemCarritoResponseDTO> listarItemCarritos(){
        return itemCarritoRepository.findAll().stream()
                .map(itemCarritoMapper::toDTO).toList();
    }
    @Override
    public ItemCarritoResponseDTO crearItemCarrito(ItemCarritoRequestDTO itemCarritoDTO){
        ItemCarrito itemCarrito = itemCarritoMapper.toEntity(itemCarritoDTO);
        ItemCarrito savedItemCarrito = itemCarritoRepository.save(itemCarrito);
        return itemCarritoMapper.toDTO(savedItemCarrito);
    }
    @Override
    public ItemCarritoResponseDTO modificarItemCarrito(Long id, ItemCarritoRequestDTO itemCarritoDTO){
        ItemCarrito itemCarrito = itemCarritoRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Item Carrito no encontrado"));

        itemCarrito.setCarrito(itemCarritoDTO.getCarrito());
        itemCarrito.setProducto(itemCarritoDTO.getProducto());
        itemCarrito.setCantidad(itemCarritoDTO.getCantidad());

        ItemCarrito savedItemCarrito = itemCarritoRepository.save(itemCarrito);

        return itemCarritoMapper.toDTO(savedItemCarrito);
    }
    @Override
    public void eliminarItemCarrito(Long id){
        itemCarritoRepository.deleteById(id);

    }
}
