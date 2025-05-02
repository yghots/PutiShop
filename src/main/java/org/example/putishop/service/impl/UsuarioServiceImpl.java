package org.example.putishop.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.putishop.dto.Usuario.UsuarioRequestDTO;
import org.example.putishop.dto.Usuario.UsuarioResponseDTO;
import org.example.putishop.entity.Usuario;
import org.example.putishop.mapper.UsuarioMapper;
import org.example.putishop.repository.UsuarioRepository;
import org.example.putishop.service.UsuarioService;
import org.example.putishop.service.VentaService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    @Override
    public List<UsuarioResponseDTO> listarUsuarios() {
        return usuarioRepository.findAll().stream()
                .map(usuarioMapper::toDTO)
                .toList();
    }

    @Override
    public UsuarioResponseDTO crearUsuario(UsuarioRequestDTO usuarioDTO) {
        Usuario usuarioEntity = usuarioMapper.toEntity(usuarioDTO);
        Usuario savedUsuario = usuarioRepository.save(usuarioEntity);
        return usuarioMapper.toDTO(savedUsuario);
    }

    @Override
    public UsuarioResponseDTO modificarUsuario(Long id, UsuarioRequestDTO usuarioDTO) {
        Usuario usuarioEntity = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
        usuarioEntity.setCodigoUsuario(usuarioDTO.getCodigoUsuario());
        usuarioEntity.setUsername(usuarioDTO.getUsername());
        usuarioEntity.setName(usuarioDTO.getName());
        usuarioEntity.setFoto(usuarioDTO.getFoto());
        usuarioEntity.setRol(usuarioDTO.getRol());
        usuarioEntity.setEstado(usuarioDTO.isEstado());

        Usuario savedUsuario = usuarioRepository.save(usuarioEntity);
        return usuarioMapper.toDTO(savedUsuario);
    }

    @Override
    public void eliminarUsuario(Long id) {

    }
}
