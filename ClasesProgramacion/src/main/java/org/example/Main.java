package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
//
//Planteamiento del Problema
//Dados tres números calcule:
//         La suma de los tres
// El promedio de los tres
// El producto de los tres
//Además determine:
//         El menor de los tres
//
//-----------------------------------
//
//
//Planteamiento del Problema
//Se necesita un programa que permita manejar transacciones de una cuenta.
//El saldo inicial de la cuenta debe ser de Col. 0.00
//El programa debe solicitar al usuario que indique si desea realizar un depósito o un retiro.
//Si el usuario elige hacer un retiro, se solicita un valor y debe verificarse que haya saldo suficiente para retirar. De no ser
//así se envía un mensaje al usuario notificando esa situación. Si hay saldo suficiente, se resta el valor ingresado al saldo.
//Si el usuario elige hacer un depósito se solicita un valor y ese valor se suma al saldo.
//Al final de cada transacción se pregunta al usuario si desea realizar otra transacción. Si contesta afirmativamente, se
//repiten las acciones anteriores. Si no, se termina el programa, mostrando el saldo final de la cuenta.
