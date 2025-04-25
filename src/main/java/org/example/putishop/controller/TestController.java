package org.example.putishop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework  .jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test-db")
    public String testDb() {
        try {
            String result = jdbcTemplate.queryForObject("SELECT 1", String.class);
            return "Conexión exitosa a la base de datos!";
        } catch (Exception e) {
            return "Error al conectar a la base de datos: " + e.getMessage();
        }
    }
}