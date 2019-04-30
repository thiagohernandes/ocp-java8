package ocp.classe.cap5.lambda.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionPredicate {

    public static void main(String...$$){
        BiFunction<String, String, String> concatStr = (x, y) -> x + y;
        System.out.println(concatStr.apply("hello ", "world"));

        BiPredicate<List<Integer>, Integer> listContains = List::contains;
        List aList = Arrays.asList(10, 20, 30);
        System.out.println(listContains.test(aList, 20));

        BiConsumer<List<Integer>, Integer> listAddElement = List::add;
        List aaList = new ArrayList();
        listAddElement.accept(aaList, 10);
        System.out.println(aList);
    }
}
