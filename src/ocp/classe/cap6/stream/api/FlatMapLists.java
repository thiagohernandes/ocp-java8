package ocp.classe.cap6.stream.api;

import java.util.Arrays;
import java.util.List;

public class FlatMapLists {

    public static void main(String []args) {
        List<List<Integer>> intsOfInts = Arrays.asList(
                Arrays.asList(1, 3, 5),
                Arrays.asList(2, 4));
        intsOfInts.stream()
                .flatMap(ints -> ints.stream())
                .sorted()
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}
