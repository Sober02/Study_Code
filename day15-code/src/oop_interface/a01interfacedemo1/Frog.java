package oop_interface.a01interfacedemo1;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃虫子");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "在蛙泳");
    }
}
