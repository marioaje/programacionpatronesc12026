package org.example.repository;

import org.example.model.Libro;

import java.util.ArrayList;
import java.util.List;
//Es como que leee desde los api o wcf
public class BibliotecaRepositoryMemoria implements IBibliotecaRepository {

    private List<Libro> librosLista = new ArrayList<>();





    public void agregarLibro(Libro libro){
        //Pero debemos validar
        librosLista.add(libro);
    }

    ////listar

}
