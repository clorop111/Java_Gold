import java.util.ArrayList;
import java.util.List;

public class Sample01 {
  private List<Object> list = new ArrayList<>();
  public void add(Object obj) {
    if (obj instanceof Test01) {
      this.list.add(obj);
    }
    //do something
  }
}