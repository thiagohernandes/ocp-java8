package ocp.classe.cap5.lambda.functional;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateValues {
    public static void main(String []args) {
        Random random = new Random();
        Stream.generate(random::nextInt)
                .limit(2)
                .forEach(System.out::println);
    }
}
