import java.util.ArrayList;
import java.util.List;

public class Exercise {
  public static void main(String[] args) {
    List<? extends Number> list = new ArrayList<Integer>();
    // list.add(10);
    // list.add(20);
    // list.add(30);
    list.add(null);
    list.add(null);
    list.add(null);    

    for (Number n : list) {
      System.out.println(n); 
    }
  }
}
