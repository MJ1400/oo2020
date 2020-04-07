/**
 * Parent
 */
public abstract class Parent {

    public String name = "Peter";
    public String job = "Developer";

    public void speak(){
        System.out.println("My name is " + this.name + " and my job is " + this.job);
    }

    public abstract void myThinkingProcess(); // abstract due to each child class having individual approach to implementation
    public abstract void myLearningProcess(); // abstract due to each child class having individual approach to implementation
    public abstract void howILive(); // abstract due to each child class having individual approach to implementation

    public void howMyDayStarts(){
        // I wake up
        System.out.println("I wake up");

        // These go to child classes:
        // Do I eat or not?
        // Do I travel by car or by train or do I walk
    }
}