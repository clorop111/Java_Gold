package ex09;

public class Sample {
    public static void main(String[] args) {
        try (Test t = new Test()) {
            throw new RuntimeException("B");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
