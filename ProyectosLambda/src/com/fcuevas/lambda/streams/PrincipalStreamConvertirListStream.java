package com.fcuevas.lambda.streams;

import com.fcuevas.lambda.streams.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PrincipalStreamConvertirListStream {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona("Felipe","Cuevas"));
        personas.add(new Persona("Camila","Jacob"));
        personas.add(new Persona("Daniel","Cuevas"));
        personas.add(new Persona("Lisi","Cuevas"));
        personas.add(new Persona("Jaime","Jacob"));

        personas.stream()
                .map(todoJunto -> todoJunto.getNombre().toUpperCase()
                .concat(" ").concat(todoJunto.getApellido().toUpperCase()))
                .forEach(System.out::println);
    }
}
