package com.fcuevas.lambda.introduccion;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateLambda {
    public static void main(String[] args) {
        Predicate<Integer> predicado = num -> num < 10;
        Boolean r = predicado.test(11);
        System.out.println(r);

        Predicate<String> otroPredicado = rol -> rol.equals("ADMIN");
        System.out.println(otroPredicado.test("ADMIN"));

        BiPredicate<String, String> biPredicado = String::equals;
        System.out.println(biPredicado.test("Felipe","Francisco"));

        BiPredicate<Integer, Integer> otroBiPredicado = (a, b) -> a < b;
        Boolean r2 = otroBiPredicado.test(7,10);
        System.out.println(r2);
    }
}
