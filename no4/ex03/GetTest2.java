package ex03;

import java.util.Optional;

public class GetTest2 {
    public static void main(String[] args) {
        Optional<String> sample = Optional.empty();
        System.out.println(sample.orElseGet(() -> "empty"));
    }
}
