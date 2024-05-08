package ex36;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        List b = List.copyOf(a);
        b.add(3);
        List<List<Integer>> c = List.of(a, b);
        System.out.println(c);
    }
}
