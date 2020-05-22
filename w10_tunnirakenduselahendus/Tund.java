import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Tund {

    public static void main(String[] args) throws IOException {
        int test2[] = new int[2];
        List<String> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        Logger logger = Logger.getLogger(Tund.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        try{
            int test1 = 14/0;
            
        }
        catch(Exception e1) {
            System.out.println("Error!");
            logger.warning(e1.getMessage());
        }
        try{
            int var = test2[3];
        }
        catch(Exception e2) {
            System.out.println("Error!");
            logger.warning(e2.getMessage());
            
        }

        listA.add("TEST12342");
        listA.add("TEST25346");
        listA.add("TEST35555555555555");
        listA.add("TEST43463467");

        listB.add(1);
        listB.add(2);
        listB.add(3);
        listB.add(4);
        listB.add(5);
        listB.add(6);
        listB.add(7);
        listB.add(8);
        listB.add(9);
        listB.add(10);
        listB.add(7);
        listB.add(7);
        listB.add(3);
        listB.add(8);

        for(String s : listA) {
            System.out.println(s);
        }

        for(int i : listB) {
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
        listB.stream().filter(i -> i > 2).forEach(System.out::println);
        System.out.println("---------------------------------------");
        List<String> lowercases = listA.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowercases);
        System.out.println("---------------------------------------");
        listB.stream().map(i -> i * 2).forEach(System.out::println);
        System.out.println("---------------------------------------");
        listA.stream().map(s -> s.length()).forEach(System.out::println);

        IntStream.of(1, 3, 5, 7, 10, 5, 12, 5, 26, 34).map(e -> e * e).forEach(System.out::println);

        IntStream.range(1, 100).filter(i -> i % 2 == 0).forEach(System.out::println);

        boolean answer1 = listB.stream().allMatch(num-> num > 3); 
        System.out.println(answer1);

        boolean answer2 = listB.stream().anyMatch(num-> num > 3); 
        System.out.println(answer2);
        
    }
}


