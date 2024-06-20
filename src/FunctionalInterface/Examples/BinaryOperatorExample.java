package FunctionalInterface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        BinaryOperator<Integer> sum = Integer::sum;
//        numeros.clear();
        int total = numeros.stream().reduce(0,sum);
        System.out.println(total);
        BinaryOperator<Integer> mul = (a, b) -> a * b;
        System.out.println("Multiplicação");
        numeros.stream().reduce(mul).ifPresent(System.out::println);
        float total2 = numeros.stream().map(a -> (float) a).reduce(1f,(a, b) -> b / a);
        System.out.println(total2);
    }
}
