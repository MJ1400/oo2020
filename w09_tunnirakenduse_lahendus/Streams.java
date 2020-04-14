import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /* for (Integer i : integerList){
            System.out.println(i);
        } */

        // Lambda () -> ...
        /* integerList.forEach(i -> System.out.println(i)); */
        /* integerList.forEach(System.out::println); */

        List<Integer> integerList2 = integerList.stream()
                                .filter(element -> element < 5)
                                //.peek(System.out::println)
                                .collect(Collectors.toList());

        //integerList2.forEach(System.out::println);

        List<Integer> integerList3 = integerList.stream()
                                .filter(element -> element < 3)
                                .map(element -> element * 2)
                                //.peek(System.out::println)
                                .map(element -> element * 2)
                                //.peek(System.out::println)
                                .collect(Collectors.toList());

        /* System.out.println(integerList.stream().count());
        System.out.println(integerList.stream().skip(3).count()); */

        //IntStream.rangeClosed(1, 5).forEach(System.out::println);

        /* IntStream.of(1, 2, 4, 8)
                .map(e -> e * e)
                .filter(e -> e < 50)
                    .forEach(System.out::println); */

        /* IntStream.iterate(1, i -> i * 2).limit(10).forEach(System.out::println); */

        /* IntStream.range(1, 10)
                .filter(e -> e % 2 == 0)
                .mapToDouble(e -> Math.pow(e, 2)) 
                .forEach(System.out::println);

        
        System.out.println(IntStream.of(2, 4, 6, 8, 10).allMatch(e -> e % 2 == 0));
        System.out.println(IntStream.of(2, 4, 6, 8, 9, 10).anyMatch(e -> e % 2 != 0)); */

        /* System.out.println(IntStream.of(1, 5, 10).filter(e -> e > 4).findFirst().getAsInt()); */
        /* System.out.println(IntStream.of(1, 5, 10).filter(e -> e > 4).min().getAsInt());
        System.out.println(IntStream.of(1, 5, 10).filter(e -> e > 4).max().getAsInt()); */

    }   
}