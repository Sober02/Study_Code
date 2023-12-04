package a01search_code;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //课堂练习1:
        //需求;定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求: 不需要考虑数组中元素是否重复


        //课堂练习2:
        //需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
        // 要求:需要考虑数组中元素有重复的可能性


        //课堂练习1:
        int[] arr = {131,127,147,81,103,23,103,79};
        int number = 103;
        System.out.println(basicSearch(arr, 103));

        //课堂练习2:
        //调用方法获取集合
        ArrayList<Integer> list = getIndex(arr, number);
        //遍历集合打印重复元素的索引
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
    //需要: 数组  查找的数据
    //返回 索引
    public static int basicSearch(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    //需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
    //要求:需要考虑数组中元素有重复的可能性
    //{131,127,147,81,103,23,103,79}
    //将找到的索引存入一个容器 数组/集合
    //返回数组/集合
    public static ArrayList<Integer> getIndex(int[] arr, int number){
        //定义一个集合存放索引
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                //将索引i添加到集合中
                list.add(i);
            }
        }
        return list;
    }
}
