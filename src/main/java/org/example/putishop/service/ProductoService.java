package org.example.putishop.service;

import org.example.putishop.dto.Producto.ProductoRequestDTO;
import org.example.putishop.dto.Producto.ProductoResponseDTO;
import org.example.putishop.dto.Venta.VentaResponseDTO;
import org.example.putishop.entity.Producto;

import java.util.List;

public interface ProductoService {
    List<ProductoResponseDTO> ListarProductos();
    ProductoResponseDTO CrearProducto(ProductoRequestDTO producto);
    ProductoResponseDTO ModificarProducto(Long id, ProductoRequestDTO producto);
    void EliminarProducto(Long id);
}
