package ex08;

public interface Test {
    public default void execute(String str) {
        System.out.println("A");
    }
}
