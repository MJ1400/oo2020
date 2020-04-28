import java.util.List;

/**
 * Generics
 */
public class Generics {

    public static <T> T getFirst(List<T> list) {
        if (list.isEmpty()) return null;
        return list.get(0);
    }

    public static <T extends Vehicle> int getWheels(T type) {
        return type.wheels;
    }

    /* public static void getType(int number){}
    public static void getType(long number){}
    public static void getType(String number){}
    public static void getType(byte number){} */

    public static <T> String getType(T type) {
        //return type.getClass().getName();
        return type.getClass().getSimpleName();
    }

}