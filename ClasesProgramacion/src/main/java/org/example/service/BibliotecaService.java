package org.example.service;

import org.example.model.Libro;
import org.example.repository.IBibliotecaRepository;

public class BibliotecaService implements IBibliotecaService  {

    private IBibliotecaRepository bibliotecaRepository;

    public BibliotecaService (IBibliotecaRepository bibliotecaRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
    }


    public void agregarLibro(Libro libro) {
        //Esto se envia hacia al DAO
        bibliotecaRepository.agregarLibro(libro);
    }

    //listar

}
