package a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        /*
        V put(K key,V value)                    添加元素
        V remove(Object key )                   根据键刚除键值对元素
        void clear()                            移除所有的键值对元素
        boolean containsKey(Object key)         判断集合是否包含指定的键
        boolean containsValue(Object value)     判断集合是否包含指定的值
        boolean isEmpty()                       判断集合是否为空
        int size()                              集合的长度，也就是集合中键值对的个数
         */

        //1.创建Map集合的对象
        Map<String,String> m = new HashMap<>();

        //2.添加元素
        //put方法的细节:
        //添加/覆盖
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中,方法返回null
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        String value1 = m.put("ME", "xiaolili");
        System.out.println(value1);//null
        m.put("键aaa","值aaa");
        m.put("键bbb","值bbb");
        String value2 = m.put("键bbb", "值ccc");//用 值ccc 覆盖 值bbb 并返回值bbb
        System.out.println(value2);//值bbb
        m.put("键ddd","值ddd");

        //根据键刚除键值对元素
        String value3 = m.remove("键ddd");
        System.out.println(value3);//值ddd

        //清空
        //m.clear();

        System.out.println("--------------------------");
        //判断集合是否包含指定的键
        boolean resultKey = m.containsKey("Me");
        System.out.println(resultKey);//true

        //判断集合是否包含指定的值
        boolean resultValue = m.containsValue("xiaolili");
        System.out.println(resultValue);//true

        //判断集合是否为空
        System.out.println(m.isEmpty());//false


        //集合的长度，也就是集合中键值对的个数
        int size = m.size();
        System.out.println(size);

        //3.打印集合
        System.out.println(m);
    }
}
