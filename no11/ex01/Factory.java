package ex01;

public class Factory {
    public static Object create() {
        return new Item("apple", 100);
    }
    
}
