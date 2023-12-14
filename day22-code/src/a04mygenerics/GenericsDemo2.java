package a04mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("abc");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list.get(0));

        System.out.println(list);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(123);
        list2.add(555);
        list2.add(666);

        int i = list2.get(2);
        System.out.println(i);

        System.out.println(list2);
    }
}
