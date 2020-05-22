public class Mouse3 extends Mouse{
    String texture = "Glossy";
    String type = "Wireless optical";

    public void connect() {
        System.out.println("Mouse connected!");
    }

    public void getType() {
        System.out.println(type);
    }
    
}