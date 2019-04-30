package ocp.classe.cap6.stream.api;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ResultsToCollection {

    public static void main(String...args) {
        String frenchCounting = "un:deux:trois:quatre";
        List gmailList = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toList());
        gmailList.forEach(System.out::println);
    }
}
