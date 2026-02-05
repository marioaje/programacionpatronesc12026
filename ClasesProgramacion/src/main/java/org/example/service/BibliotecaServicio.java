package org.example.service;

import org.example.model.Libro;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaServicio {
    private List<Libro> librosLista = new ArrayList<>();

    public void agregarLibro(Libro libro){
        //Pero debemos validar
        librosLista.add(libro);
    }
}
