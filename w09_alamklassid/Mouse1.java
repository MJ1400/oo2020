public class Mouse1 extends Mouse {

    String type = "Trackball";

     void superTest() {
        System.out.println("This is subclass' type: " + type);
        System.out.println("This is upperclass' type: " + super.type);
    }

    public void getType() {
        System.out.println(type);
    }
    
}