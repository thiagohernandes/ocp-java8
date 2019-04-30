package ocp.classe.cap6.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class DataCalculationMethodsStream {

    public static void main(String...args){
        String[] string = "you never know what you have until you clean your room".split(" ");
        System.out.println(Arrays.stream(string).min(String::compareTo).get());

        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        System.out.println(Arrays.stream(string).min(lengthCompare).get());

        String limerick = "There was a young lady named Bright " +
                "who traveled much faster than light " +
                "She set out one day " +
                "in a relative way " +
                "and came back the previous night ";
        IntSummaryStatistics wordStatistics =
                Pattern.compile(" ")
                        .splitAsStream(limerick)
                        .mapToInt(word -> word.length())
                        .summaryStatistics();
        System.out.printf(" Number of words = %d \n Sum of the length of the words = %d \n" +
                        " Minimum word size = %d \n Maximum word size %d \n " +
                        " Average word size = %f \n", wordStatistics.getCount(),
                wordStatistics.getSum(), wordStatistics.getMin(),
                wordStatistics.getMax(), wordStatistics.getAverage());

        int[] x = {1,2,3,4};
        System.out.println(IntStream.of(x).sum());

        int xx = IntStream.of(10, 20, 30, 40).reduce(0, ((sum, val) -> sum + val));
        System.out.println(xx);
    }
}
