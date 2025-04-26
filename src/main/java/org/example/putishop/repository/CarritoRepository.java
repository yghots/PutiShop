package org.example.putishop.repository;

import org.example.putishop.entity.Carrito;
import org.example.putishop.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {

}
