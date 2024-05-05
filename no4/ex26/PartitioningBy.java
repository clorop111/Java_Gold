package ex26;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args) {
        List<Item> list = Arrays.asList(
            new Item(1, ItemType.BOOK, "Java", 1980),
            new Item(2, ItemType.BOOK, "Lamda", 2980),
            new Item(3, ItemType.MAGAZIN, "Software", 980),
            new Item(4, ItemType.MAGAZIN, "Test", 1280)
        );

        Map<Boolean, List<Item>> map =
            list.stream().collect(
                Collectors.partitioningBy(
                    item -> item.getPrice() > 1000
                )
            );
        System.out.println(map);
    }
}