interface Animal {
    public void speak();
    public void sleep();
    public void beSneaky();
    public void lookAround();
    public void attack();
    public void defend();
    
}

class Cow implements Animal {
    String name = "Cow";
    public void speak() {
        System.out.println("baa-baa");
    }

     public void eat(){
        System.out.println(name + " eats and restores health");
    }

    public void sleep(){
        System.out.println(name + " will sleep for 5 minutes");
    }

    public void beSneaky(){
        System.out.println(name + " sneaks away from the herd");
    }

    public void lookAround(){
        System.out.println("*" + name + " sneaks away from the herd*");
    }

    public void attack() {
        System.out.println(name + " attacks another" + name + "!");
    }

    public void defend() {
        System.out.println(name + " defends itself and takes 0 damage!");
    }

}

class Sheep implements Animal {
    String name = "Sheep";
    
    public void speak() {
        System.out.println("baa-baa");
    }
    public void eat(){
        System.out.println(name + " eats and restores health");
    }

    public void sleep(){
        System.out.println(name + " will sleep for 5 minutes");
    }

    public void beSneaky(){
        System.out.println(name + " sneaks away from the herd");
    }

    public void lookAround(){
        System.out.println("*" + name + " sneaks away from the herd*");
    }

    public void attack() {
        System.out.println(name + " attacks another " + name + "!");
    }

    public void defend() {
        System.out.println(name + " defends itself and takes 0 damage!");
    }
}

class MainClass {
  public static void main(String[] args) {
      Cow cow = new Cow();
      Sheep sheep = new Sheep();
      cow.eat();
      cow.sleep();
      cow.beSneaky();
      sheep.lookAround();
      sheep.attack();
      sheep.defend();
  }
}