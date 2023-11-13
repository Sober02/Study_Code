package oop_innerclass;

import org.w3c.dom.ls.LSOutput;

public class Car {
     String carName;
     int carAge;
     String carColor;

    //外部类要访问内部类的成员，必须创建对象
    public void show(){
        System.out.println(carName);
        //System.out.println(engineName); error
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    class Engine{
        String engineName;
        int engineAge;


        public void show(){
            //内部类可以直接访问外部类的成员，包括私有
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
