package test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        /*
        添加用户对象并判断是否存在
        需求:
        1，main方法中定义一个集合，存入三个用户对象
        用户属性为:id，username，password
        2，要求:定义一个方法，根据id查找对应的用户信息
        如果存在，返回对应的索引
        如果不存在，返回-1
         */

        //1.定义一个集合
        ArrayList<User> list = new ArrayList<>();
        //创建用户对象
        User u1 = new User("001", "zhangsan", "zhangsan123");
        User u2 = new User("002", "lisi", "lisi123");
        User u3 = new User("003", "wangwu", "wangwu123");

        //2.存入三个用户对象
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //3.定义一个方法，根据id查找对应的用户信息
        int index = getIndex(list, "004");
        System.out.println("用户对应的索引是" + index);
    }

    //根据id查找对应用户信息
    //需要 - 1.集合  2.id
    //返回索引/-1
    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            //获取到对象
            User u = list.get(i);
            //比较id
            if (u.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
