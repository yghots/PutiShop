package org.example.putishop.repository;

import org.example.putishop.entity.Producto;
import org.example.putishop.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
