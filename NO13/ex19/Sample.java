package ex19;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Set<String> set = new HashSet<>();
        String[] array = {"a", "b", "c", "d", "a"};
        for (String str : array) {
            list.add(str);
            set.add(str);
        }
        System.out.println(set.size() + "," + list.size() + ",");
        Set set2 = new HashSet<>(list);
        List list2 = new LinkedList<>(set);
        System.out.println(set2.size() + "," + list2.size() + ",");

    }
}
