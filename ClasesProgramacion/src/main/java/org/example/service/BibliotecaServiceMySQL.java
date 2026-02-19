package org.example.service;

import org.example.model.Libro;
import org.example.repository.IBibliotecaRepository;
import org.example.repository.IBibliotecaRepositoryMySQL;

public class BibliotecaServiceMySQL implements IBibliotecaServiceMySQL  {

    private IBibliotecaRepositoryMySQL bibliotecaRepository;

    public BibliotecaServiceMySQL(IBibliotecaRepositoryMySQL bibliotecaRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
    }


    public void agregarLibro(Libro libro) {
        //Esto se envia hacia al DAO
        bibliotecaRepository.agregarLibro(libro);
    }

    //listar

}
