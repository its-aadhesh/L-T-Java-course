package optionalDemo;

import java.util.Optional;

/**
 * Optional Class Demo
 * Shows usage of Optional to avoid null checks.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println("Is value present? " + opt.isPresent());
        System.out.println("Value or default: " + opt.orElse("Default Value"));
        opt = Optional.of("Hello");
        opt.ifPresent(val -> System.out.println("Value: " + val));
    }
}
