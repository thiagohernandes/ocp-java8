package ocp.classe.cap4.generics.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Aluno {
    int id;
    String nome;

    public Aluno() {
    }

    public Aluno(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    List<Aluno> lista(){
        return Arrays.asList(new Aluno(1, "Beltrano"),
                             new Aluno(2, "Ariano"),
                             new Aluno(3, "Delano"));
    }
}

public class StreamsSources {

    public static void main(String...$$) {

        IntStream.range(1, 6).forEach(System.out::print);
        System.out.println(" ");
        IntStream.rangeClosed(1, 6).forEach(System.out::print);
        System.out.println(" ");
        IntStream.iterate(1, i -> i + 1).limit(5).forEach(System.out::print);
        System.out.println(" ");
        Arrays.stream(new int[] {1, 2, 3, 4, 5}).filter(i -> i > 2).forEach(System.out::print);
        System.out.println(" ");
        new Aluno().lista().stream().forEach(aluno -> {
            System.out.println(aluno.id + " - " + aluno.nome);
        });

        Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);
        Stream.of(new Integer[]{1, 2, 3, 4, 5}).forEach(System.out::println);

      //  new Random().ints().filter(numero -> numero > 1 && numero < 60).limit(5).forEach(System.out::println);

        "hello".chars().sorted().forEach(ch -> System.out.printf("%c ", ch));

        Stream.of(1, 2, 3, 4, 5).map(i -> i * i).peek(i -> System.out.printf("%d ", i)).count();

        Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();
    }
}
