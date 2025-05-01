package org.example.putishop.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.Producto.ProductoRequestDTO;
import org.example.putishop.dto.Producto.ProductoResponseDTO;
import org.example.putishop.entity.Producto;
import org.example.putishop.mapper.ProductoMapper;
import org.example.putishop.repository.ProductoRepository;
import org.example.putishop.service.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;
    private final ProductoMapper productoMapper;

    @Override
    public List<ProductoResponseDTO>ListarProductos()
    {
        return productoRepository.findAll().stream()
                .map(productoMapper::toDTO)
                .toList();
    }
    @Override
    public ProductoResponseDTO CrearProducto(ProductoRequestDTO productoDTO){
        Producto producto = productoMapper.toEntity(productoDTO);
        Producto guardado = productoRepository.save(producto);
        return productoMapper.toDTO(producto);
    }

    @Override
    public ProductoResponseDTO ModificarProducto(Long id ,ProductoRequestDTO productoDTO) {
        Producto productoExistente = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + id));

        productoExistente.setCodigoProducto(productoDTO.getCodigoProducto());
        productoExistente.setCategoria(productoDTO.getCategoria());
        productoExistente.setNombre(productoDTO.getNombre());
        productoExistente.setStock(productoDTO.getStock());
        productoExistente.setPrecio(productoDTO.getPrecio());
        productoExistente.setEstado(productoDTO.isEstado());

        Producto guardado = productoRepository.save(productoExistente);
        return productoMapper.toDTO(guardado);

    }

    @Override

    public void EliminarProducto(Long id){
        productoRepository.deleteById(id);
    }

}
