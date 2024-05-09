package ex10;

public class Test implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("A");
    }
    
}
