package ex24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingSample {
  public static void main(String[] args) {
    List<Item> list = Arrays.asList(
      new Item(1, ItemType.BOOK, "Java", 1980),
      new Item(2, ItemType.BOOK, "Lamda", 2980),
      new Item(3, ItemType.MAGAZIN, "Software", 980),
      new Item(4, ItemType.MAGAZIN, "Test", 1280)
    );

    Map <ItemType, List<Item>> group =
              list.stream().collect(
                Collectors.groupingBy(
                  Item::getType
                )
              );
          System.out.println(group);        
  } 
}

// toList()
// collect(Collectors.toList())
// reduce(Collectors.toList())
// getList()
