package org.example;

import org.example.controller.BibliotecaController;
import org.example.controller.TresNumerosController;
import org.example.view.TresNumerosView;
import org.example.misc.Conexion;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Connection conexion =  Conexion.getConnection();
//        if (conexion != null){
//            System.out.println("Conexion establecida");
//        }
//
        BibliotecaController bibliotecaController = new BibliotecaController();
        bibliotecaController.inicioSistema();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        TresNumerosView tresNumerosView = new TresNumerosView();
//        TresNumerosController tresNumerosController = new TresNumerosController(tresNumerosView);
//
//        tresNumerosController.inicioSistema();
    }
}

//Primera version ( Controller --> Service --> Almacenamiento )


//Segunda version ( Controller --> Interface(Service) --> repository --> Almacenamiento )