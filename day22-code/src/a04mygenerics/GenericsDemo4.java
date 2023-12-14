package a04mygenerics;


public class GenericsDemo4 {
    public static void main(String[] args) {
        //泛型接口的两种使用方式:
            //1.实现类给出具体的类型
            //2.实现类延续泛型，创建实现类对象时再确定类型

        //1.在MyArrayList2这个泛型接口中，实现类已经给出具体的类型String
        MyArrayList2 list = new MyArrayList2();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        //2.实现类延续泛型，创建实现类对象时再确定类型
        MyArrayList3<Integer> list2 = new MyArrayList3<>();
        list2.add(123);
        list2.add(321);
        list2.add(456);


    }
}
