package org.example.putishop.controller.internal;

import lombok.RequiredArgsConstructor;
import org.example.putishop.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/venta")
public class VentaController {

    @Autowired
    private final VentaService ventaService;
}
