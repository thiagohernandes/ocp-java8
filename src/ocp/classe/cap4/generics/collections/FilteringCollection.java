package ocp.classe.cap4.generics.collections;

import java.util.stream.IntStream;

public class FilteringCollection {

    public static void main(String []args) {
        IntStream.rangeClosed(0, 10)
                .filter(i -> (i % 2) == 0)
                .forEach(System.out::println);
    }
}
