abstract class Mouse {

    String type = "Mouse";
    
    public void leftClick() {
        System.out.println("Left click");
    }
    public void rightClick()  {
        System.out.println("Right click");
    }
    
    
    public void scroll() {
        System.out.println("Scrolled");
    }

    public abstract void getType();
    


}