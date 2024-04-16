import java.util.Map;

public class Test15 {
  public static void main(String[] args) {
  var a = Map.entry(1, "A");
  var b = Map.entry(1, "B");
  var c = Map.entry(1, "C");
  Map<Integer, String> map = Map.ofEntries(a, b, c);

  for (/*insert code here */ Map.Entry<Integer, String> entry : map.entrySet())
    System.out.println(entry.getKey()
                        + ":"
                        + entry.getValue());
  }

}

// Map<Integer, String> entry : map.getEntry()
// Set<Integer, String> entry : map.entrySet()
// Map.Entry<Integer, String> entry : map.entrySet()
// Set.Entry<Integer, String> entry : map.getEntry()