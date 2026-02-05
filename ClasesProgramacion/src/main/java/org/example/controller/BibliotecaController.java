package org.example.controller;

import org.example.service.BibliotecaServicio;
import org.example.view.BibliotecaView;

public class BibliotecaController {

    private BibliotecaView bibliotecaVista;
    private BibliotecaServicio bibliotecaServicio;
    //????

    public BibliotecaController() {
        bibliotecaVista = new BibliotecaView();
        bibliotecaServicio = new BibliotecaServicio();
    }


    public void inicioSistema(){
        //Capturar los datos, desdel la vista con una funcion
        bibliotecaVista.MensajeInicio();
    }

}
