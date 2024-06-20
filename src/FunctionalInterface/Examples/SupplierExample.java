package FunctionalInterface.Examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        List<String> saudacoes = Stream.generate(supplier).limit(5).toList();
        saudacoes.forEach(System.out::println);
        Supplier<String> supplier2 = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello World 2";
            }
        };

        List<String> saudacoes2 = Stream.generate(supplier2).limit(5).toList();
        saudacoes2.forEach(System.out::println);

        List<String> saudacoes3 = Stream.generate(() -> "Hello World 3").limit(5).toList();
        saudacoes3.forEach(System.out::println);

        List<String> saudacoes4 = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return "Hello World 4";
            }
        }).limit(5).toList();
        saudacoes4.forEach(System.out::println);
    }
}
