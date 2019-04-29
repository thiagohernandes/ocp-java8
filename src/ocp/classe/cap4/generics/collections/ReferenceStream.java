package ocp.classe.cap4.generics.collections;

import java.util.Arrays;
import java.util.List;

public class ReferenceStream {

    public static void main(String...$$) {
        List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
        strings.forEach(string -> System.out.println(string));

        System.out.println("---------------");

        strings.forEach(System.out::println);
    }
}
