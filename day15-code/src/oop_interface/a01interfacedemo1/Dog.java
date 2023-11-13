package oop_interface.a01interfacedemo1;

public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "在狗刨");
    }
}
