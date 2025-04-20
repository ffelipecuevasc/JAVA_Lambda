package com.fcuevas.lambda.propio;

public class Calculadora {
    public double calcular(double a, double b, Operacion lambda){
        return lambda.operacion(a, b);
    }
}
