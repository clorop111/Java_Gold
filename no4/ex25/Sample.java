package ex25;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        Map<String, Integer> map = Arrays.asList(
            new Book("A", 1000),
            new Book("B", 2000),
            new Book("A", 500)
        ).stream()
        .collect(
            Collectors.groupingBy(
                Book::getTitle,
                Collectors.summingInt(Book::getPrice)
            ) 
        );
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
    }    
}


/*
reduce(Book::getPrice)

reduce(b -> b.getPrice())

summingInt(b -> b.getPrice())

Collectors.groupingBy(
    Book::getTitle,
    Collectors.summingInt(Book::getPrice)
) 
*/