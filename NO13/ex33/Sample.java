import java.util.ArrayList;

public class Sample {
  public static void main(String[] args) {
      var list = new ArrayList<>();
      list.add("A");
      list.add(100);
      list.add("B");
      list.set(1, 200);
      list.remove(2);
      list.set(3, 300);
      System.out.println(list);
  }
}
