package ex29;

public class Sample {
    private static void test() throws TestException {
        try {
            // do something
            throw new TestException("A");
        } catch (SampleException | RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
