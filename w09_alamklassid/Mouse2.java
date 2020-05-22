public class Mouse2 extends Mouse {
    String texture = "Matte";
    String type = "Optical";
    

    public void setColor(String color) {
        System.out.println("RGB Color: " + color);
    }

    public void getType() {
        System.out.println(type);
    }
}