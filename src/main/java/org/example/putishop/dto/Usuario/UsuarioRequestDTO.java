package org.example.putishop.dto.Usuario;

import lombok.Data;

@Data
public class UsuarioRequestDTO {
    private String codigoUsuario;
    private String username;
    private String name;
    private String foto;
    private String rol;
    private boolean estado;
}
