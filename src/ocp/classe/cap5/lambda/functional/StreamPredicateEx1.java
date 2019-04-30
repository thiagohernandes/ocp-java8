package ocp.classe.cap5.lambda.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class StreamPredicateEx1 {

    public static void main(String...args) {
        IntStream.range(1, 10).filter(i -> (i % 2) == 0).forEach(System.out::println);

       /* IntPredicate      boolean test(int value) Evaluates the condition passed as int and
                            returns a boolean value as result
        LongPredicate       boolean test(long value) Evaluates the condition passed as long and
                            returns a boolean value as result
        DoublePredicate     boolean test(double value) Evaluates the condition passed as double and
                            returns a boolean value as result */

        IntPredicate evenNums = i -> (i % 2) == 0;
        IntStream.range(1, 10).filter(evenNums).forEach(System.out::println);

        Predicate<String> predicateStringFilter = i -> i.startsWith("a");
        List<String> lista = Arrays.asList("a","b","aa","ab","de");
        lista.stream().filter(predicateStringFilter).forEach(System.out::println);
    }

}
