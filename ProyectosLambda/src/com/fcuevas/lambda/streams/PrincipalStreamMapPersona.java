package com.fcuevas.lambda.streams;

import java.util.stream.Stream;
import com.fcuevas.lambda.streams.model.Persona;

public class PrincipalStreamMapPersona {
    public static void main(String[] args) {

        Stream<Persona> personas = Stream.of("Francisco Cuevas", "Felipe Cerón", "Alicia Cuevas")
                .map(p -> new Persona(p.split(" ")[0], p.split(" ")[1]));

        personas.forEach(System.out::println);

    }
}
