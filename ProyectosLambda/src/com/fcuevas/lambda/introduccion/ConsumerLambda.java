package com.fcuevas.lambda.introduccion;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerLambda {
    public static void main(String[] args) {

        /*
        Una expresión lambda en Java es una función anónima que permite escribir código más conciso y
        claro. Se usa principalmente para implementar interfaces funcionales de forma compacta, sin
        necesidad de definir una clase o un método adicional.

        Consumer<T> es una interfaz funcional en Java que representa una operación que acepta un
        solo argumento de tipo T y no devuelve ningún resultado. Se usa para realizar acciones sobre
        un objeto (por ejemplo, imprimirlo, modificarlo o almacenarlo en una estructura de datos).

        La siguiente operación se puede lograr con programación orientada a objetos creando una clase
        anónima:

            Consumer<String> consumidor = new Consumer<String>() {
                @Override
                public void accept(String saludo) {
                    System.out.println(saludo);
                }
            };

        Otra manera es creando una clase que implemente la interfaz Consumer e implemente el método
        accept().

        Como la interfaz Consumer solo tiene el método accept(), automáticamente con lambda se implementa
        ese método con el parámetro que recibe dicho método por argumento (en la firma) y a continuación
        se programa la operación a hacer dentro del método.

        Cuando la operación a realizar dentro del método es solo 1, se escribe directo a continuación
        del operador lambda (->) como sigue a continuación:

            Consumer<String> consumidor = saludo -> System.out.println(saludo);

        Cuando la operación a realizar dentro del método abarca varias sentencias, entonces debe abrirse
        llaves {} después del operador lambda como sigue a continuación:

            Consumer<String> consumidor = saludo -> {
                ...
                System.out.println(saludo);
                ...
            };
        */

        Consumer<String> consumidor = (saludo) -> System.out.println(saludo);
        consumidor.accept("Hola mundo");

        /*
        Acá tenemos el uso de otra interfaz pero que consume 2 parámetros, en este caso la expresión
        lambda debe ser declarada con paréntesis en primera instancia, donde se colocan los 2 parámetros
        a diferencia del primer caso donde el método sólo utilizaba 1 parámetro y se podía colocar sin
        paréntesis.
        */

        BiConsumer<String, Integer> biConsumidor = (nombre, edad) -> {
            System.out.println(nombre + " tiene " + edad + " años.");
        };
        biConsumidor.accept("Felipe",35);

        /*En el siguiente caso vemos la manera de acortar aún más la expresión lambda. Ya que la interfaz
        * Consumer solamente tiene 1 método abstracto, vimos en el comentario de la línea 38 que se puede
        * reducir a una expresión lambda de 1 sola línea de código. Pero cuando el método en cuestión
        * solamente maneja 1 solo parámetro, la expresión lambda se puede acortar más todavía de la
        * siguiente forma:
        *
        *       Consumer<String> otroConsumidor = System.out::println;
        *
        * Esto significa que se inicializa el consumidor con una implementación anónima de la interfaz
        * Consumer donde el único método en cuestión muestra con un 'print' el único parámetro que el
        * método maneja.*/

        Consumer<String> otroConsumidor = System.out::println;
        otroConsumidor.accept("Ingenieria Informatica");

        /*¿Por qué forEach() ejecuta accept() en cada elemento?

        - Porque forEach() está diseñado para recorrer la lista y aplicar la función proporcionada
        (Consumer<T>) en cada elemento.
        - Porque otroConsumidor es un Consumer<String> que define accept() como System.out.println().
        - Porque en Java, las interfaces funcionales pueden usarse directamente con forEach() para
        escribir código más limpio y conciso.*/

        List<String> lista = Arrays.asList("Chuch","Norris","Steven","Seagal");
        lista.forEach(otroConsumidor);

        /*Abajo se presenta otra interfaz (Supplier) y otra expresión lambda:
        1 - Si la expresión lambda tiene una sola línea de código (sin return), las llaves {} son opcionales.
        2 - Si el cuerpo de la lambda tiene varias líneas o usa return, las llaves {} son obligatorias.
        */

        Supplier<String> proveedor = () -> {return "Hola desde la interfaz Supplier";};
        System.out.println(proveedor.get());
    }
}
