package a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式

        //练习一:通过键值对对象进行遍历map集合，要求: 装着键值对对象的单列集合使用增强for的形式进行遍历
        //练习二:通过键值对对象进行遍历map集合，要求: 装着键值对对象的单列集合使用迭代器的形式进行遍历
        //练习三:通过键值对对象进行遍历map集合，要求: 装在键值对对象的单列集合使用Lambda表达式的形式进行遍历


        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        //键：人物外号
        //值：人物名字
        map.put("标枪选手","马车");
        map.put("星辰之子","曜");
        map.put("人物挂件","瑶");

        //练习一：增强for
        //3.Map借号的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1 通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //3.2 遍历entries这个集合，去得到里面的每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            //3.3 利用entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
            //System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("-----------------------------");
        //练习二：迭代器
        Set<Map.Entry<String, String>> entries2 = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entries2.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("-----------------------------");
        //练习三：lambda表达式
        Set<Map.Entry<String, String>> entries3 = map.entrySet();
        entries3.forEach( entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
    }
}
