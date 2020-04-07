
public class Child extends Parent {
    public String eat = "Kellogs";
    public String travel = "Car";

    public void howMyDayStarts(){
        super.howMyDayStarts();

        // These go to child classes:
        // Do I eat or not?
        // Do I travel by car or by train or do I walk

        System.out.println("I eat " + eat);
        System.out.println("I travel by " + travel);
    }

    @Override
    public void myThinkingProcess() {
        // TODO Auto-generated method stub

    }

    @Override
    public void myLearningProcess() {
        // TODO Auto-generated method stub

    }

    @Override
    public void howILive() {
        // TODO Auto-generated method stub

    }

}