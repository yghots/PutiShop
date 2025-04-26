package org.example.putishop.repository;

import org.example.putishop.entity.Usuario;
import org.example.putishop.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {

}
