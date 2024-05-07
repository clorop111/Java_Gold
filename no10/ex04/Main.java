package ex04;

public class Main {
    public static void main(String[] args) {
        Item a = new Item.Builder()
                    .setName("sample")
                    .build();
                System.out.println(a.getName());
    }
}
