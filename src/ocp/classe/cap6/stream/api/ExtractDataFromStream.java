package ocp.classe.cap6.stream.api;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ExtractDataFromStream {
    public static void main(String...args) {
        long count = Stream.of(1, 2, 3, 4, 5).map(i -> i * i).count();
        System.out.printf("The stream has %d elements", count );
        System.out.println();
        Stream.of(1, 2, 3, 4, 5).map(i -> i * i).forEach(System.out::println);

        long countPeek = Stream.of(1, 2, 3, 4, 5)
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();
        System.out.printf("%nThe stream has %d elements", countPeek);

        Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();

        System.out.println();

        DoubleStream.of(1.0, 4.0, 9.0)
                .map(Math::sqrt)
                .peek(System.out::println)
                .sum();
    }
}
