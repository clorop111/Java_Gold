package ex02;

@Test02(name = "test", price = 100)
public class Item02 {
  private String name;
  private int price;

  public Item(String name, int price) {
    this.name = name;
    this.price =price;
  }

  public String getName() {
    return name;
  }
 }
