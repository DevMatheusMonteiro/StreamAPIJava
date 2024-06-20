package FunctionalInterface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        Consumer<Integer> imprimirNumeroParClasseAnonima = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if(integer % 2 == 0){
                    System.out.println(integer);
                }
            }
        };
        System.out.println("Usando classe anônima");
        numeros.forEach(imprimirNumeroParClasseAnonima);

        System.out.println("Usando com expressão lambda");
        numeros.forEach(imprimirNumeroPar);

        // Sem method reference
        //numeros.stream().filter(numero -> numero % 2 == 0).forEach(num -> System.out.println(num));
        // Com method reference
        System.out.println("Usando com stream");
        numeros.stream().filter(numero -> numero % 2 == 0).forEach(System.out::println);
    }
}
