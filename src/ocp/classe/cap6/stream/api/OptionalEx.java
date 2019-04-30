package ocp.classe.cap6.stream.api;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class OptionalEx {

    public static void selectHighestTemperature(Stream<Double> temperatures) {
        Optional<Double> max = temperatures.max(Double::compareTo);
        if(max.isPresent()) {
            System.out.println(max.get());
        }
    }

    public static void selectHighestTemperature(DoubleStream temperatures) {
        OptionalDouble max = temperatures.max();
        max.ifPresent(System.out::println);
    }

    public static void main(String []args) {
        Optional<String> string = Optional.of(" abracadabra ");
        string.map(String::trim).ifPresent(System.out::println);

        Optional<String> nullableStr = Optional.ofNullable(null);
        System.out.println(nullableStr);

        Optional<String> string1 = Optional.ofNullable(null);
        System.out.println(string1.map(String::length).orElse(-1));

      //  Optional<String> string2 = Optional.ofNullable(null);
       // System.out.println(string2.map(String::length).orElseThrow(IllegalArgumentException::new));

        selectHighestTemperature(DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
    }
}
