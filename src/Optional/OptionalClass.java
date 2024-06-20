package Optional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> optionalOf = Optional.of("Hello");
//        Optional<String> optionalOf = Optional.of(null); lança NullPointerException. Não deixa passar
        System.out.println("Optional of: " + optionalOf.isPresent());
        Optional<String> optionalOfNullable = Optional.ofNullable(null); // Deixa passar mesmo se for nulo
        System.out.println("Optional ofNullable: " + optionalOfNullable.isPresent());
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("Optional empty: " + optionalEmpty.isPresent());
        Optional<String> optionalIsPresent = Optional.of("Hello");
        System.out.println("Optional isPresent: " + optionalIsPresent.isPresent());
        Optional<String> optionalIsEmpty = Optional.ofNullable(null);
        System.out.println("Optional isEmpty: " + optionalIsEmpty.isEmpty());
        Optional<String> optionalGet = Optional.ofNullable("Hello");
        System.out.println("Optional get: " + optionalGet.get());
        Optional<String> optionalOrElse = Optional.ofNullable(null);
        System.out.println("Optional orElse: " + optionalOrElse.orElse("Hello"));
        Optional<String> optionalOrElseGet = Optional.ofNullable(null);
        System.out.println("Optional orElseGet: " + optionalOrElseGet.orElseGet(() -> "Hello do supplier"));
        Optional<String> optionalOrElseThrow = Optional.ofNullable(null);
        try {
            System.out.println("Optional orElseThrow: " + optionalOrElseThrow.orElseThrow(() -> new RuntimeException("Erro")));
        } catch (RuntimeException e) {
            System.out.println("Optional orElseThrow: " + e.getMessage());
        }
        Optional<String> optionalIfPresent = Optional.of("Hello");
        optionalIfPresent.ifPresent((value) -> System.out.println("Optional ifPresent: " + value));
    }
}
