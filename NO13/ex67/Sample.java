package ex67;

public class Sample {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D"};
        Integer[] array2 = {1, 2, 3, 4, 5};

        Test test = new Test();
        Test<String> test2 = new Test<>();

        System.out.println(test2.count(array, "A"));
        System.out.println(test.count(array, "A"));
        System.out.println(test.count(array2, 1));
    }
}
