package ex48;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Item> list =
                new ArrayList<>(List.of(
                        new Item("banana", 100),
                        new Item("apple", 80),
                        new Item("orange", 80)));
        list.sort(
                Comparator.comparing(Item::getPrice)
                .thenComparing(Item::getName)
                .reversed());
        list.forEach(item ->
            System.out.println(" " + item.getName()));  
    }
}
