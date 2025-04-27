package org.example.putishop.dto.Usuario;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioResponseDTO {
    private Long id;
    private String codigoUsuario;
    private String username;
    private String name;
    private String foto;
    private String rol;
    private boolean estado;
}
