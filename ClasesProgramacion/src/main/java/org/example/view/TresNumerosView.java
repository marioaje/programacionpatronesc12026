package org.example.view;

import java.util.Scanner;

public class TresNumerosView {

    private Scanner scanner = new Scanner(System.in);

    public int pedirNumero(String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }

}
