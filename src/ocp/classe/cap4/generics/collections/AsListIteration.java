package ocp.classe.cap4.generics.collections;

import java.util.Arrays;
import java.util.List;

public class AsListIteration {
    public static void main(String []args) {
        List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
        strings.forEach(string -> System.out.println(string));

        System.out.println("----------------");

        for(String item : strings){
            System.out.println(item);
        }
    }
}