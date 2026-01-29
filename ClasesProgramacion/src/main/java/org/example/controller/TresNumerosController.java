package org.example.controller;

import org.example.model.TresNumerosModel;
import org.example.view.TresNumerosView;

public class TresNumerosController {

    private TresNumerosView tresNumerosView = new TresNumerosView();

    public TresNumerosController(TresNumerosView tresNumerosView)
    {
        this.tresNumerosView = tresNumerosView;
    }

    public void inicioSistema(){
        int numero1 = tresNumerosView.pedirNumero("Ingresa el numero de 1 a 10");
        int numero2 = tresNumerosView.pedirNumero("Ingresa el numero de 1 a 10");
        int numero3 = tresNumerosView.pedirNumero("Ingresa el numero de 1 a 10");

        TresNumerosModel tresNumerosModel = new TresNumerosModel(numero1, numero2, numero3);

    }

}


//pedirNumero(Numero 1)
//pedirNumero(Numero 1)
//pedirNumero(Numero 1)
//public int pedirNumero()