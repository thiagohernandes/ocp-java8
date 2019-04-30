package ocp.classe.cap6.stream.api;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SearchDataStream {

    public static void selectHighestTemperature(Stream<Double> temperatures) {
        System.out.println(temperatures.max(Double::compareTo));
    }

    public static void main(String...args) {
        // Average temperatures in Concordia, Antarctica in a week in October 2015
        boolean anyMatch
                = IntStream.of(-56, -57, -55, -52, -48, -51, -49).anyMatch(temp -> temp > 0);
        System.out.println("anyMatch(temp -> temp > 0): " + anyMatch);
        boolean allMatch
                = IntStream.of(-56, -57, -55, -52, -48, -51, -49).allMatch(temp -> temp > 0);
        System.out.println("allMatch(temp -> temp > 0): " + allMatch);
        boolean noneMatch
                = IntStream.of(-56, -57, -55, -52, -48, -51, -49).noneMatch(temp -> temp > 0);
        System.out.println("noneMatch(temp -> temp > 0): " + noneMatch);

        Method[] methods = Stream.class.getMethods();
        Optional<String> methodName = Arrays.stream(methods)
                .map(method -> method.getName())
                .filter(name -> name.endsWith("Match"))
                .sorted()
                .findFirst();
        System.out.println("Result: " + methodName.orElse("No suitable method found"));

        OptionalDouble temperature = DoubleStream.of(-10.1, 2, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(temp -> temp > 0)
                .findFirst();
        System.out.println("First matching temperature > 0 is " + temperature.getAsDouble());

        selectHighestTemperature(Stream.of(24.5, 23.6, 77.0, 27.9, 21.1, 23.5, 25.5, 28.3));
    }

}
