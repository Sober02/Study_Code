package arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

    //ArrayList成员方法
/*            方法名                               说明
（增）   boolean add(E e)            添加元素，返回值表示是否添加成功
（删）   boolean remove(E e)         删除指定元素，返回值表示是否删除成功
         E remove(int index)         删除指定索引的元素，返回被删除元素
（改）   E set(int index,E e)        修改指定索引下的元素，返回原来的元素
（查）   E get(int index)            获取指定索引的元素
         int size()                  集合的长度，也就是集合中元素的个数
*/
        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        //boolean result = list.add("aaa");
        //System.out.println(result);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //3.删除元素
//        boolean result1 = list.remove("ccc");//true
//        boolean result2 = list.remove("fff");//false
//        System.out.println(result1);
//        System.out.println(result2);
        String str = list.remove(2);
        System.out.println(str);

        //4.修改元素
        String modifyStr = list.set(2,"qqq");
        System.out.println(modifyStr);

        //5.查找元素
        String getStr = list.get(2);
        System.out.println(getStr);

        //6.元素长度
        System.out.println(list.size());

        System.out.println(list);
    }
}
