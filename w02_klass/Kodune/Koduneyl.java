package Kodune;

public class Koduneyl {

    public static void main(String[] args) {
        Furniture couch = new Furniture(1, 5);
        Furniture lamp = new Furniture(3, 1);
        System.out.println("Diivani k6rgus on: " + couch.height + " ja diivani laius on " + couch.width);
        System.out.println("Lambi k6rgus on: " + lamp.height + " ja lambi laius on " + lamp.width);
        

    }
    
}