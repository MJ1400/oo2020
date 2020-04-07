
public class Parent {

    public String name;
    public String job;

    public boolean isIndependent; 

    public int armSlots = 2;
    public int legSlots = 2;

    public Parent(String name, String job){
        this.name = name;
        this.job = job;
        this.isIndependent = true;
    }

    public void speak(){
        System.out.println("My name is " + this.name + " and my job is " + this.job + " and is independent " + this.isIndependent);
    }
}