import java.util.List;

/**
 * Generics
 */
public class Generics {

    public static <T> T getFirst(List<T> list) {
        return list.get(0);
    }

    public static <T extends Vehicle> int getWheels(T type) {
        return type.wheels;
    }

}