package org.example.putishop.mapper;

import org.example.putishop.dto.Usuario.UsuarioRequestDTO;
import org.example.putishop.dto.Usuario.UsuarioResponseDTO;
import org.example.putishop.entity.Usuario;
import org.springframework.stereotype.Component;

//todo: 
@Component
public class UsuarioMapper {
    public UsuarioResponseDTO toDTO(Usuario usuario) {
        return UsuarioResponseDTO.builder()
                .id(usuario.getId())
                .codigoUsuario(usuario.getCodigoUsuario())
                .username(usuario.getUsername())
                .name(usuario.getName())
                .foto(usuario.getFoto())
                .rol(usuario.getRol())
                .estado(usuario.isEstado())
                .build();
    }
    public Usuario toEntity(UsuarioRequestDTO usuarioRequestDTO) {
        Usuario usuario = new Usuario();
        usuario.setCodigoUsuario(usuarioRequestDTO.getCodigoUsuario());
        usuario.setUsername(usuarioRequestDTO.getUsername());
        usuario.setName(usuarioRequestDTO.getName());
        usuario.setFoto(usuarioRequestDTO.getFoto());
        usuario.setRol(usuarioRequestDTO.getRol());
        usuario.setEstado(usuarioRequestDTO.isEstado());
        return usuario;
    }
}
