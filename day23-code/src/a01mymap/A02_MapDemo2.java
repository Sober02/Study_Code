package a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式
        //通过键找值

        //练习一:利用键找值的方式遍历map集合，要求: 装着键的单列集合使用增强for的形式进行遍历
        //练习二:利用键找值的方式遍历map集合，要求: 装着键的单列集合使用迭代器的形式进行遍历
        //练习三:利用键找值的方式遍历map集合，要求: 装着键的单列集合使用lambda表达式的形式进行遍历

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        //练习一：增强for
        //3.通过键找值
        //3.1获取所有的键，把这些键放到一个单列集合中
        Set<String> keys = map.keySet();
        //3.2遍历单列集合，得到每一个键
        for (String key : keys) {
            //System.out.println(keys);
            //3.3利用map集合中的键获取对应的值 get
            String value = map.get(key);
            System.out.println(key + "=" + value);

        }

        System.out.println("--------------------------");
        //练习二：迭代器遍历
        Set<String> keys2 = map.keySet();
        Iterator<String> it = keys2.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("--------------------------");
        //练习三：lambda表达式
        Set<String> keys3 = map.keySet();
        keys3.forEach(key -> System.out.println(key + "=" + map.get(key)));

    }
}
