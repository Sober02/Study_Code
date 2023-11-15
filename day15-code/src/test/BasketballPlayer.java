package test;

public class BasketballPlayer extends Sportsman{


    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("运动员在学打篮球");
    }
}
