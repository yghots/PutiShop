package org.example.putishop.mapper;

import org.example.putishop.dto.Producto.ProductoRequestDTO;
import org.example.putishop.dto.Producto.ProductoResponseDTO;
import org.example.putishop.entity.Producto;
import org.springframework.stereotype.Component;

//TODO: COMPLETADO
@Component
public class ProductoMapper {

    public ProductoResponseDTO toDTO(Producto producto) {
        return ProductoResponseDTO.builder()
                .id(producto.getId())
                .codigoProducto(producto.getCodigoProducto())
                .categoria(producto.getCategoria())
                .nombre(producto.getNombre())
                .stock(producto.getStock())
                .precio(producto.getPrecio())
                .estado(producto.isEstado())
                .build();
    }
    public Producto toEntity(ProductoRequestDTO productoRequestDTO) {
        Producto producto = new Producto();
        producto.setCodigoProducto(productoRequestDTO.getCodigoProducto());
        producto.setCategoria(productoRequestDTO.getCategoria());
        producto.setNombre(productoRequestDTO.getNombre());
        producto.setStock(productoRequestDTO.getStock());
        producto.setPrecio(productoRequestDTO.getPrecio());
        producto.setEstado(productoRequestDTO.isEstado());
        return producto;
    }
}
