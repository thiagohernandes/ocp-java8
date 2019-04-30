package ocp.classe.cap5.lambda.functional;

import java.util.Arrays;
import java.util.List;

public class ABSNumbers {

    public static void main(String...$$) {
        List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
        System.out.println("Before: " + ell);
        ell.replaceAll(Math::abs);
        System.out.println("After: " + ell);
    }
}
