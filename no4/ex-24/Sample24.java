import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample24 {
  public static void main(String[] args) {
    Department tokyo = new Department("Tokyo");
    Department osaka = new Department("Osaka");  
    List<Employee> list = List.of(
        new Employee("Johnny", tokyo),
        new Employee("Bond", osaka),
        new Employee("Micky", tokyo),
        new Employee("Sara", osaka)
    );
    /*insert code here */ Map<Department, List<Employee>> result =
            list.stream().collect(
                Collectors.groupingBy(Employee::getDept)
            );   
  } 
}

Map<Department, Employee>
Map<List<Department>, List<Employee>>
Map<Department, List<Employee>>
List<Employee>
List<Department>