package ocp.classe.cap5.lambda.functional;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AtomicGenerate {

    public static void main(String...$$) {
        AtomicInteger ints = new AtomicInteger(0);
        Stream.generate(ints::incrementAndGet).limit(10).forEach(System.out::println);
        // prints integers from 1 to 10 on the console
    }
}
