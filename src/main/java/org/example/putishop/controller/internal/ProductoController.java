package org.example.putishop.controller.internal;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.Producto.ProductoRequestDTO;
import org.example.putishop.dto.Producto.ProductoResponseDTO;
import org.example.putishop.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor

public class ProductoController {
    @Autowired
    private final ProductoService productoService;

    @GetMapping
    public List<ProductoResponseDTO> listarProductos(){
        return productoService.ListarProductos();
    }

    @PostMapping
    public ProductoResponseDTO guardarProducto(@RequestBody ProductoRequestDTO producto){
        return productoService.CrearProducto(producto);
    }

    @PutMapping
    public ProductoResponseDTO modificarProducto(Long id,ProductoRequestDTO producto){
        return productoService.ModificarProducto(id,producto);
    }

    @DeleteMapping
    public void eliminarProducto(@PathVariable Long id){
        productoService.EliminarProducto(id);
    }
}
