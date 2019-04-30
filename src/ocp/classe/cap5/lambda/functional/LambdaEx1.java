package ocp.classe.cap5.lambda.functional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaEx1 {

    public static void main(String...$$) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);
        Stream<List<Integer>> x = (Stream<List<Integer>>) lista;
    }

}
