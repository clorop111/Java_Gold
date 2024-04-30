package ex02;

import java.util.Optional;

public class GetTest2 {
    public static void main(String[] args) {
        Optional<String> sample = Optional.empty();
        if(sample.isEmpty()) {
            System.out.println("empty");
            return;
        }
        System.out.println(sample.get());
    }
}
