package FunctionalInterface.Examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = x -> x * 2;
        numeros.stream().map(dobrar).forEach(System.out::println);
        System.out.println("*******");
        numeros.stream().map(n -> n * 3).forEach(System.out::println);
        System.out.println("*******");
        List<Integer> numerosQuadruplicados = numeros.stream().map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 4;
            }
        }).sorted((n1, n2) -> Integer.compare(n2, n1)).toList();
        numerosQuadruplicados.forEach(System.out::println);
    }
}
