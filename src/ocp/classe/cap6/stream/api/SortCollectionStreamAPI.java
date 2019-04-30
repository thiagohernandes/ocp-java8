package ocp.classe.cap6.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortCollectionStreamAPI {

    public static void main(String...args) {
        List words = Arrays.asList("follow your heart but take your brain with you".split(" "));
        words.stream().distinct().sorted().forEach(System.out::println);

        System.out.println();

        List wordsLenght =
                Arrays.asList("follow your heart but take your brain with you".split(" "));
        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        wordsLenght.stream().distinct().sorted(lengthCompare).forEach(System.out::println);
    }
}
