package ex23;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Sample2 {
  public static void main(String[] args) {
    List<Item> list = Arrays.asList(
      new Item(1, ItemType.BOOK, "Java", 1980),
      new Item(2, ItemType.BOOK, "Lamda", 2980),
      new Item(3, ItemType.MAGAZIN, "Software", 980),
      new Item(4, ItemType.MAGAZIN, "Test", 1280)
    );

    List<Item> books =
        list.stream()
            .filter(item ->
              item.getType() == ItemType.BOOK)
            .collect(Collectors.toList());
          
          books.forEach(System.out::println);                
  } 
}