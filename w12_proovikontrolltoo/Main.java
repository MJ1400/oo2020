import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> strings = Arrays.asList("one", "two", "three");
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Character> characters = Arrays.asList('a', 'b', 'c');
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);

        System.out.println(
            Generics.getFirst(strings) + " " +
            Generics.getFirst(integers) + " " + 
            Generics.getFirst(characters) + " " + 
            Generics.getFirst(doubles)
        );

        SimplePair<String, String> pair = new SimplePair<>("name", "Raimo");
        
        System.out.println(
            pair.getKey() + " " + 
            pair.getValue()
        );

        Car car = new Car();
        Vehicle car2 = new Car();
        Vehicle vehicle = new Vehicle();
        //Motorbike motorbike = new Motorbike();

        System.out.println(
            Generics.getWheels(car) + " " +
            Generics.getWheels(car2) + " " +
            Generics.getWheels(vehicle)
        );

    }
}