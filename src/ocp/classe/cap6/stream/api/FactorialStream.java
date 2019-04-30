package ocp.classe.cap6.stream.api;

import java.util.stream.IntStream;

public class FactorialStream {

    public static void main(String...args) {
        System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y)).getAsInt());
    }
}
