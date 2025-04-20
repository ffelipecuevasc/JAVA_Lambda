package com.fcuevas.lambda.introduccion;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionLambda {
    public static void main(String[] args) {

        /*Function es otra interfaz que mezcla la funcionalidad de Consumer & Supplier, es decir,
        * recibe un parámetro y retorna un parámetro. La estructura es la siguiente:
        *
        *   Function <T , V> donde T es el Java Genérico del parámetro recibido y V el de retorno.
        *
        * En el siguiente ejemplo vemos la creación de un objeto del tipo Function con su inicialización
        * en expresión lambda del único método de la interfaz, apply(). En el ejemplo anterior vimos
        * que la expresión lambda al tener un valor de retorno debe ir entre llaves {}:
        *
        *   Supplier<String> proveedor = () -> {return "Hola desde la interfaz Supplier";};
        *
        * Pero esto también se puede acortar de la siguiente manera donde automáticamente ejecuta el
        * return:
        *
        *   Supplier<String> proveedor = () -> "Hola desde la interfaz Supplier";*/

        Function<String, String> funcion = parametro -> "Hola, el parámetro es " + parametro;
        String resultado = funcion.apply("Felipe Cuevas");
        System.out.println(resultado);

        Function<String, String> otraFuncion = parametro -> parametro.toUpperCase();
        System.out.println(otraFuncion.apply("ingeniera informatica"));

        Function<String, String> otraFuncionMas = String::toUpperCase;
        System.out.println(otraFuncionMas.apply("ingeniera ciberseguridad"));

        BiFunction<String, String, String> biFuncion = (a, b) -> a.toUpperCase().concat(" ").concat(b.toUpperCase());
        String otroResultado = biFuncion.apply("Felipe","Cuevas");
        System.out.println(otroResultado);

        BiFunction<String, String, Integer> otraBiFuncion = (a, b) -> a.compareTo(b);
        System.out.println(otraBiFuncion.apply("JAVA","JAVA"));
    }
}
