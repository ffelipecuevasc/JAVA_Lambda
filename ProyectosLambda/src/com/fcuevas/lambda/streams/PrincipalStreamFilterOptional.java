package com.fcuevas.lambda.streams;

import com.fcuevas.lambda.streams.model.Persona;

import java.util.Optional;
import java.util.stream.Stream;

public class PrincipalStreamFilterOptional {
    public static void main(String[] args) {

        Stream<Persona> personas = Stream.of("Francisco Cuevas", "Felipe Cerón", "Felipe Cuevas")
                .map(p -> new Persona(p.split(" ")[0], p.split(" ")[1]))
                .filter(persona -> persona.getNombre().equals("Felipex"));

        System.out.println("\nAplicando el FILTER para guardar el valor en un OPTIONAL");
        Optional<Persona> personaOptional = personas.findFirst();

        if(personaOptional.isPresent()) System.out.println(personaOptional.get());
        else System.out.println("No se encontró la persona.");
        
    }
}
