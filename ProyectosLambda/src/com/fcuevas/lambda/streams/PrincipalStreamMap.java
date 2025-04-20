package com.fcuevas.lambda.streams;

import java.util.stream.Stream;

public class PrincipalStreamMap {
    public static void main(String[] args) {
        /*PIPELINES - STREAMS
        En el contexto de Streams en Java, un pipeline es una secuencia de operaciones encadenadas que se
        aplican a los elementos de un Stream, donde cada operación transforma o filtra los datos hasta llegar
        a un resultado final:

            Stream.of("Francisco", "Felipe", "Cuevas", "Ceron")
                .peek(n -> System.out.println(n))
                .map(nombre -> {return nombre.toLowerCase().concat(" - MAP");})
                .forEach(System.out::println);

         El pipeline, también conocido como 'tubería de procesamiento' ya que los datos fluyen por una tubería
         de procesos (o 'flujo de procesamiento' o 'cadena de operaciones'), se compone de 3 elementos:

            1) Fuente de datos (List, Set, etc).
            2) Operaciones intermedias (operaciones map(), filter(), sorted(), etc).
            3) Operaciones terminales (operaciones forEach(), count(), collect(), etc).
         */

        Stream<String> nombres = Stream.of("Francisco", "Felipe", "Cuevas", "Ceron")
                //Operador PEEK del tipo consumer, recibe parámetro y no devuelve nada, sirve para revisar
                .peek(n -> System.out.println(n))
                //Operador MAP funciona tal como una FUNCTION de stream donde recibe un parámetro y devuelve otro
                .map(nombre -> {return nombre.toLowerCase().concat(" - MAP");});

        nombres.forEach(System.out::println);

        /*ERROR COMÚN - REUTILIZAR UN STREAM

        nombres.map(n -> System.out.println(n));

        El problema es que ya consumiste el stream con forEach(...), y los streams no se pueden reutilizar. Una
        vez procesado, el stream se cierra automáticamente.*/


        System.out.println("\nSegunda manera a través de un objeto temporal STREAM\n");
        //Otra manera de invocar el operador MAP es a través de la creación temporal de un objeto STREAM
        Stream.of("Camila","Carolina","Jacob","Castillo")
                .map(n -> {return n.toUpperCase();})
                .forEach(System.out::println);
        //Este método .forEach() solo se puede aplicar así, no en una instancia de Stream<String> n porque
        //.forEach() no devuelve nada (void)
    }
}
