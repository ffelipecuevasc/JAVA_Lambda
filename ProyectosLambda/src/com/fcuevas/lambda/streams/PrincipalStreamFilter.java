package com.fcuevas.lambda.streams;

import com.fcuevas.lambda.streams.model.Persona;

import java.util.stream.Stream;

public class PrincipalStreamFilter {
    public static void main(String[] args) {

        Stream<Persona> personas = Stream.of("Francisco Cuevas", "Felipe Cerón", "Felipe Cuevas")
                .map(p -> new Persona(p.split(" ")[0], p.split(" ")[1]))
                .filter(persona -> persona.getNombre().equals("Felipe"));

        personas.forEach(System.out::println);

        System.out.println("\nAplicando el FILTER para encontrar el primer resultado y mostrarlo");
        Persona persona = Stream.of("Francisco Cuevas", "Felipe Cerón", "Felipe Cuevas")
                .map(p -> new Persona(p.split(" ")[0],p.split(" ")[1]))
                .filter(per -> per.getNombre().equals("Francisco"))
                .findFirst().get();
        System.out.println(persona);

    }
}
