package Kodune;

public class Main {
    public static void main(String[] args) {
        Functions<Integer> fn = new Functions<>(4);
        Functions<Double> f2 = new Functions<>(5.5);
        //Functions<String> fn2 = new Functions<>("aaa");
        System.out.println(fn.ruut());
        System.out.println(f2.ruut());

    }
}