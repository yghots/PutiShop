package org.example.putishop.controller.internal;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.ItemCarrito.ItemCarritoRequestDTO;
import org.example.putishop.dto.ItemCarrito.ItemCarritoResponseDTO;
import org.example.putishop.service.ItemCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/carrito")
public class CarritoController {

    @Autowired
    private final ItemCarritoService itemCarritoService;

    @GetMapping
    public List<ItemCarritoResponseDTO> listarCarritos() {
        return itemCarritoService.listarItemCarritos();
    }
    @PostMapping
    public ItemCarritoResponseDTO crearCarrito(@RequestBody ItemCarritoRequestDTO dto) {
        return itemCarritoService.crearItemCarrito(dto);
    }
    @PutMapping
    public ItemCarritoResponseDTO actualizarCarrito(Long id, ItemCarritoRequestDTO dto) {
        return itemCarritoService.modificarItemCarrito(id, dto);
    }
    @DeleteMapping
    public void eliminarCarrito(Long id) {
        itemCarritoService.eliminarItemCarrito(id);
    }
}
