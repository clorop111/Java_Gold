package ex02;

import java.util.Optional;

public class GetTest {
    public static void main(String[] args) {
        Optional<String> sample = Optional.empty();
        if(sample.isPresent()) {
            System.out.println(sample.get());
        }
    }
}
