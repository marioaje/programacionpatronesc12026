package org.example.misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://195.35.59.3:3306/u484426513_proc126?useSSL=true&serverTimezone=UTC";
    private static final String USUARIO = "u484426513_proc126";
    private static final String PASSWORD = "sP=!v8wk$2";

    //Obtener mi conexion
    public static Connection getConnection(){
        try{
            Connection conexion = DriverManager.getConnection(URL,USUARIO,PASSWORD);
            System.out.println("Conexion establecida!");
            return conexion;
        }catch(SQLException e){
            System.out.println("Error al conectar conexion");
            return null;
        }
    };

}

