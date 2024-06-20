package FunctionalInterface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Predicate<Integer> predicate = numero -> numero % 2 == 0;
        numeros.stream().filter(predicate).forEach(System.out::println);
        System.out.println("Negate: ");
        numeros.stream().filter(predicate.negate()).forEach(System.out::println);
        System.out.println("Múltiplos de quatro");
        numeros.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return 4 % integer == 0;
            }
        }).forEach(System.out::println);
    }
}
