package eu.marten.java;

/**
 * Hello world!
 *
 */
public class App {

    private String name;

    public App(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int maxValue(int a, int b) {
        return a > b ? a : b;
    }

    public boolean calculationValue(int b) {
        int a = 1;
        if (a > b){
            return false;
        } else if(a == b) {
            return true;
        } else {
            return true;
        }
    }

    public int calculation2(int b){
        int[] a = {1, 2};
        return a[b];
    }

    public int[] arrays(int nr) {
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {2, 3,4};
        if(nr == 1) {
            return ints1;
        } else {
            return ints2;
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


}
