package org.example.model;

public class TresNumerosModel {
    private int numero1;
    private int numero2;
    private int numero3;

    public TresNumerosModel(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    //Metodos
    public int calcularSuma(){
        return numero1 + numero2 + numero3;
    }

    public int calcularPromedio(){
        return (numero1 + numero2 + numero3)/3;
    }

    public int calcularProducto(){
       return numero1*numero2*numero3;
    }

    public int calcularMenor(){
        return 0;
    }

//         La suma de los tres
// El promedio de los tres
// El producto de los tres
//Además determine:
//         El menor de los tres

}
