package org.example.repository;

import org.example.misc.Conexion;
import org.example.model.Libros;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BibliotecaRepositoryMySQLTest {

    @Test
    void agregarLibrosTest() {
        BibliotecaRepositoryMySQL repositoryMySQL = new BibliotecaRepositoryMySQL();

        Libros libro = new Libros();
        libro.setTitulo("Titulo 1");
        libro.setAutor("Autor");
        libro.setCategoria("Categoria");
        libro.setDisponibilidad("Disponibilidad");

        assertDoesNotThrow(() -> repositoryMySQL.agregarLibros(libro) );

    }
}

