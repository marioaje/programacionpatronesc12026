package org.example.controller;

import org.example.model.Libro;
import org.example.repository.BibliotecaRepositoryMemoria;
import org.example.repository.BibliotecaRepositoryMySQL;
import org.example.service.*;
import org.example.view.BibliotecaView;

public class BibliotecaController {

    private BibliotecaView bibliotecaVista;
    private BibliotecaServicio bibliotecaServicio;
    private IBibliotecaService bibliotecaServicioContrato;
    private IBibliotecaServiceMySQL bibliotecaServicioContratoMySQL;
    //????

    public BibliotecaController() {
        bibliotecaVista = new BibliotecaView();
        bibliotecaServicio = new BibliotecaServicio();
        bibliotecaServicioContrato = new BibliotecaService(
                new BibliotecaRepositoryMemoria()
        );
        bibliotecaServicioContratoMySQL = new BibliotecaServiceMySQL(
                new BibliotecaRepositoryMySQL()
        );
    }


    public void inicioSistema(){
        //Capturar los datos, desdel la vista con una funcion
        //Deberian tener nuestros menus
        bibliotecaVista.MensajeInicio();
//        bibliotecaServicioContrato.agregarLibro(new Libro(
//                "Harry Potter",
//                "J K Rawling",
//                "Drama",
//                "Si"
//        ));

                bibliotecaServicioContratoMySQL.agregarLibro(new Libro(

                "Harry Potter",
                "J K Rawling",
                "Drama",
                "Si",
                 0
        ));
    }

}
