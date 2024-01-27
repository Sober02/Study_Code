package test3;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6_2 {
    public static void main(String[] args) {
         /*
        需求:统计一个文件夹中每种文件的个数并打印。(考虑子文件夹)

        打印格式如下:
                txt:3个
                doc:4个
                jpg:6个
         */

        File file = new File("E:\\aaa");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);
    }

    /*
    * 作用：
    *       统计一个文件夹中每种文件的个数
    * 参数：
    *       要统计的哪个文件夹
    * 返回值：
    *       用来统计map集合
    *       键：后缀名 值：文件个数
    *
    *       a.txt
    *       a.a.txt
    *       aaa(无需统计)
     */
    public static HashMap<String,Integer> getCount(File src){
        //定义一个Map集合用来存储文件
        HashMap<String,Integer> hm = new HashMap<>();
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历
        for (File file : files) {
            if (file.isFile()){
        //3.判断如果是文件，则添加到Map集合中
                String name = file.getName();
                String[] arr = name.split("\\.");
                if (arr.length >= 2){
                    String key = arr[arr.length - 1];
                    if (hm.containsKey(key)){
                        //存在，累加数量，添加覆盖到Map集合中
                        int count = hm.get(key);
                        count++;
                        hm.put(key,count);
                    }else {
                        //不存在，直接添加
                        hm.put(key,1);
                    }
                }
            }else{
        //4.判断如果是文件夹，则递归
                HashMap<String, Integer> sonMap = getCount(file);
                //Map中：txt 3  jpg 2  doc 3
                //sonMap中：txt 2  jpg 2
                //txt 5 jpg 4 doc 3
                //遍历sonMap把里面的值累加到hm当中
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (hm.containsKey(key)){
                        //存在，累加，添加覆盖到Map集合
                        int count = hm.get(key);
                        count += value;
                        hm.put(key,count);
                    }else {
                        //不存在，直接添加
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }
}
