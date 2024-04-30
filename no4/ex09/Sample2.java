package ex09;

import java.util.List;

public class Sample2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        list.forEach(x -> System.out.println(x));
    }
}
