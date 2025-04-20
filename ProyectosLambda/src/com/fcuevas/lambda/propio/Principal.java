package com.fcuevas.lambda.propio;

public class Principal {
    public static void main(String[] args) {
        //Operacion suma = (a, b) -> {return (a + b);};
        Operacion suma = (a, b) -> a + b;
        Operacion resta = (a, b) -> a - b;

        Calculadora c = new Calculadora();
        System.out.println(c.calcular(10,5,suma));
        System.out.println(c.calcular(10,15,resta));
    }
}
