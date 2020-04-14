import java.io.FileNotFoundException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Example
 */
public class Example {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Example.class.getName());
        FileHandler fh;
        SimpleFormatter sf = new SimpleFormatter();

        try {
            fh = new FileHandler("mylog.txt");
            fh.setFormatter(sf);
            logger.addHandler(fh);
        } catch (Exception e) {
            System.out.println("Shouldn't arrive here");
        } 

        try {
            int divideByZero = 5 / 0;
        } catch (ArithmeticException e) {
            //logger.warning(e.getMessage());
            logger.warning("Code should never reach here " + e.getMessage());
        }

        try {
            getArrayElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.warning(e.getMessage());
        }

        System.out.println("I'm here");

    }

    public static int getArrayElement() throws ArrayIndexOutOfBoundsException {
        int[] intArray = new int[]{ 1, 2, 3};
        return intArray[3];
    }
}