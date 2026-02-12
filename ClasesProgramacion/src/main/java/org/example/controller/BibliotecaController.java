package org.example.controller;

import org.example.model.Libro;
import org.example.repository.BibliotecaRepositoryMemoria;
import org.example.service.BibliotecaService;
import org.example.service.BibliotecaServicio;
import org.example.service.IBibliotecaService;
import org.example.view.BibliotecaView;

public class BibliotecaController {

    private BibliotecaView bibliotecaVista;
    private BibliotecaServicio bibliotecaServicio;
    private IBibliotecaService bibliotecaServicioContrato;
    //????

    public BibliotecaController() {
        bibliotecaVista = new BibliotecaView();
        bibliotecaServicio = new BibliotecaServicio();
        bibliotecaServicioContrato = new BibliotecaService(
                new BibliotecaRepositoryMemoria()
        );
    }


    public void inicioSistema(){
        //Capturar los datos, desdel la vista con una funcion
        //Deberian tener nuestros menus
        bibliotecaVista.MensajeInicio();
        bibliotecaServicioContrato.agregarLibro(new Libro(
                "Harry Potter",
                "J K Rawling",
                "Drama",
                "Si"
        ));
    }

}
