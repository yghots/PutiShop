package org.example.putishop.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.putishop.mapper.UsuarioMapper;
import org.example.putishop.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;
}
