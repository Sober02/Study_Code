package a04mygenerics;

import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {

        //泛型不具备继承性，但是数据具备继承性！

        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        //泛型不具备继承性
        //method(list1);
        //method(list2);//error
        //method(list3);//error

        //但是数据具备继承性！
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());

    }

    public static void method(ArrayList<Ye> list) {

    }

}

class Ye {
}

class Fu extends Ye{
}

class Zi extends Fu {
}
