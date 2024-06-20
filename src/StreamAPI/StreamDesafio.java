package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamDesafio {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.print("Desafio 1: ");
        numeros.stream().sorted().forEach(value -> System.out.print(value + ", "));
        System.out.println();
        numeros.stream().filter(n -> n % 2 == 0).reduce((a, b) -> a + b).ifPresent((value) -> System.out.println("Desafio 2: " + value));
        boolean todosPositivos = numeros.stream().allMatch((n) -> n > 0);
        System.out.println("Desafio 3: " + todosPositivos);
        System.out.print("Desafio 4: ");
        numeros.stream().filter(n -> n % 2 == 0).forEach(value-> System.out.print(value + ", "));
        List<Integer> numerosMaioresQueCinco = numeros.stream().filter(n -> n > 5).toList();
        System.out.println();
        System.out.print("Desafio 5: ");
        numerosMaioresQueCinco.stream().reduce(Integer::sum).ifPresent(value-> System.out.println(value / numerosMaioresQueCinco.size()));
        boolean algumMaiorQueDez = numeros.stream().anyMatch(n -> n > 10);
        System.out.println("Desafio 6: " + algumMaiorQueDez);
        System.out.println("Desafio 7: " + numeros.stream().sorted((a, b) -> Integer.compare(b, a)).toList().get(1));
        System.out.println("Desafio 8: " + numeros.stream().reduce(Integer::sum).get());
        List<Integer> numerosDistintos = numeros.stream().distinct().toList();
        System.out.println("Desafio 9: " + (numerosDistintos.size() == numeros.size()));
        System.out.print("Desafio 10: ");
        numeros.stream().filter(n -> (n % 2 != 0) && ((n % 3 == 0) || (n % 5 == 0))).forEach(value-> System.out.print(value + ", "));
        System.out.println();
        numeros.stream().map(n -> (int)Math.pow(n, 2)).reduce(Integer::sum).ifPresent(n -> System.out.println("Desafio 11: " + n));
        numeros.stream().reduce((n1, n2) -> n1 * n2).ifPresent(n -> System.out.println("Desafio 12: " + n));
        System.out.print("Desafio 13: ");
        numeros.stream().filter(n -> (n >= 5) && (n <= 10)).forEach(n -> System.out.print(n + ", "));
        System.out.println();
        numeros.stream().filter(n -> {
            int num = 2;
            boolean numeroPrimo = true;
            if (n < 2) return false;
            while (num < n){
                if (n % num == 0){
                    numeroPrimo = false;
                    break;
                }
                num++;
            }
            return numeroPrimo;
        }).max(Integer::compare).ifPresent(n -> System.out.println("Desafio 14: " + n));
        System.out.println("Desafio 15: " + numeros.stream().anyMatch(n -> n < 0));
        System.out.println("Desafio 16:");
        System.out.print("Pares: ");
        numeros.stream().filter(n -> n % 2 == 0).forEach(value-> System.out.print(value + ", "));
        System.out.println();
        System.out.print("Ímpares: ");
        numeros.stream().filter(n -> n % 2 != 0).forEach(value-> System.out.print(value + ", "));
        System.out.print("\nDesafio 17: ");
        numeros.stream().filter(n -> {
            int num = 2;
            boolean numeroPrimo = true;
            if (n < 2) return false;
            while (num < n){
                if (n % num == 0){
                    numeroPrimo = false;
                    break;
                }
                num++;
            }
            return numeroPrimo;
        }).forEach(value -> System.out.print(value + ", "));
        System.out.println();
        System.out.println("Desafio 18: " + (numerosDistintos.size() == 1));
        System.out.print("Desafio 19: ");
        numeros.stream().filter(n -> ((n % 3 == 0) || (n % 5 == 0))).reduce(Integer::sum).ifPresent(System.out::println);
    }
}
