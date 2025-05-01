package org.example.putishop.controller.internal;

import lombok.RequiredArgsConstructor;
import org.example.putishop.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;
}
