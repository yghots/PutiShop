package org.example.putishop.service;

import org.example.putishop.dto.Usuario.UsuarioRequestDTO;
import org.example.putishop.dto.Usuario.UsuarioResponseDTO;

import java.util.List;

public interface UsuarioService {
    List<UsuarioResponseDTO> listarUsuarios();
    UsuarioResponseDTO crearUsuario(UsuarioRequestDTO usuario);
    UsuarioResponseDTO modificarUsuario(Long id, UsuarioRequestDTO usuario);
    void eliminarUsuario(Long id);
}
