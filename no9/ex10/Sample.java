package ex10;

public class Sample {
  public static void main(String[] args) {
    Item item = new Item("apple", 100);
     item.setName(null);
    System.out.println(item.getName() + ":" + item.getPrice());
  }
}
