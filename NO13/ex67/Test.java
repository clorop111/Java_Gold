package ex67;

public class Test<T> {
    public int count (T[] array, T val) {
        int count = 0;
        for (T v : array) {
            if (val.equals(v)) {
                count++;
            }
        }
        return count;
    }    
}
