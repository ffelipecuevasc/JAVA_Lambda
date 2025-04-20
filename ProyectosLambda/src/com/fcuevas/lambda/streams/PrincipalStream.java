package com.fcuevas.lambda.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrincipalStream {
    public static void main(String[] args) {
        /*
        La clase Stream<T> forma parte de la API de Java Streams, introducida en Java 8 dentro del paquete
        java.util.stream. Su propósito es facilitar el procesamiento de colecciones de datos de manera funcional
        y eficiente, utilizando operaciones como filtrado, mapeo, reducción y procesamiento paralelo.

        📌 Características clave de Stream<T>

        - No almacena datos → Un Stream no es una estructura de datos como List o Set, sino una secuencia
        de datos que fluye a través de operaciones intermedias y finales.

        - Operaciones perezosas (Lazy Evaluation) → Las operaciones intermedias (filter, map, etc.) no se
        ejecutan hasta que se llama a una operación terminal (collect, forEach, etc.).

        - Inmutabilidad → Un Stream no modifica la fuente de datos; en su lugar, genera nuevos Streams.

        - Puede ser secuencial o paralelo → Se pueden ejecutar en un solo hilo o en múltiples hilos
         (parallelStream()).

        - Soporta pipelines de procesamiento → Se pueden encadenar operaciones para realizar transformaciones
         complejas de datos.

        📌 Ahondar en la primera característica: Una List<T> o Set<T> almacena permanentemente los datos en
        memoria. En cambio, un Stream<T> no almacena nada; simplemente procesa los datos en el momento en que
        se ejecuta una operación terminal. El Stream<T> puede obtener sus valores a partir de una colección
        propia de la JCF (como List), o se le puede asignar valores a un objeto Stream<T> de forma directa de
        la siguiente manera (pero esto no significa que los datos los guarde en memoria de forma persistente,
        ya que solamente los guarda para hacer operaciones y una vez finalizadas las operaciones los datos son
        desechados):

                Stream<String> nombres = Stream.of("Francisco", "Felipe", "Cuevas", "Ceron");
        */

        Stream<String> nombres = Stream.of("Francisco", "Felipe", "Cuevas", "Ceron");

        /*
        La manera convencional de recorrer y mostrar los valores almacenados adentro a través de expresiones
        lambda sería la siguiente:

                1) nombres.forEach(v -> System.out.println(v));
                2) nombres.forEach(System.out::println); - FORMA OPTIMIZADA

        Pero si yo ejecuto las 2 formas al mismo tiempo, arroja una IllegalStateException. El error
        IllegalStateException ocurre en la segunda operación con forEach porque un Stream en Java no puede
        reutilizarse una vez consumido.
         */
        nombres.forEach(System.out::println);

        List<String> coleccion = new ArrayList<>();
        coleccion.add("Camila");
        coleccion.add("Carolina");
        coleccion.add("Jacob");
        coleccion.add("Castillo");

        Stream<String> listaStream = coleccion.stream();
        listaStream.forEach(System.out::println);
        //O también puede ser directo en la lista con = coleccion.stream().forEach(System.out::println);
    }
}
