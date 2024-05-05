package ex11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sample {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream out
            = new ObjectOutputStream(
                new FileOutputStream("emp.ser"));
        try (out) {
            Employee emp 
                = new Employee("sample", "03123145678");
            out.writeObject(emp);
        }
    }
}
