package org.example.repository;

import org.example.misc.Conexion;
import org.example.model.Libro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Es como que leee desde los api o wcf
public class BibliotecaRepositoryMySQL implements IBibliotecaRepositoryMySQL {


    public void agregarLibro(Libro libro){
        //Pero debemos validar

        String sql = "INSERT INTO `u484426513_proc126`.`libroProfe`(`titulo`,`autor`,`categoria`,`disponibilidad`)" +
                "  VALUES ( ?, ?, ?, ?) ";

        try(    Connection conexion = Conexion.getConnection();
            PreparedStatement ps = conexion.prepareStatement(sql)
        ){
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getCategoria());
            ps.setString(4, libro.getDisponibilidad());

            ps.executeUpdate();

            System.out.println("Libro agregado exitosamente");

        } catch (SQLException e) {
            System.out.println("Libro no agregado error");
        }


    }



    ////listar

}
