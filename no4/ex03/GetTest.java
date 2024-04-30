package ex03;

import java.util.Optional;

public class GetTest {
    public static void main(String[] args) {
        Optional<String> sample = Optional.empty();
        System.out.println(sample.orElse("empty"));
    }
}