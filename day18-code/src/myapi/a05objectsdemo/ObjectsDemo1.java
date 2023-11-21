package myapi.a05objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        /*
        public static boolean equals(Object a, Object b)    先做非空判断，比较两个对象
        public static boolean isNul1(Object obj)            判断对象是否为null，为null返回true,反之
        public static boolean nonNul1(Object obj)           判断对象是否为nu11，跟isNu11的结果相反
         */

        //创建对象
        Student s1 = null;
        Student s2 = new Student("zhangsan",23);

        //比较两个属性值是否相等
//        if (s1 != null){
//            System.out.println(s1.equals(s2));
//        }else{
//            System.out.println("调用者为空");
//        }


        System.out.println(Objects.equals(s1, s2));//false
        //细节：
        //1.方法的底层会判断s1是否为null，如果为null，直接返回false
        //2.如果s1不是null，那么就利用s1再次调用equals方法
        //3.此时s1是Student类型，所以最终还是会调用Student中的equals方法。
        // 如果没有重写，比较地址值，如果重写了，就比较属性值



       //public static boolean isNul1(Object obj)     判断对象是否为null，为null返回true,反之
        Student s3 = new Student("lisi",24);
        Student s4 = null;
        System.out.println(Objects.isNull(s3));//false
        System.out.println(Objects.isNull(s4));//true

        //public static boolean nonNul1(Object obj)   判断对象是否为nu11，跟isNu11的结果相反
        System.out.println(Objects.nonNull(s3));//true
        System.out.println(Objects.nonNull(s4));//false
    }
}
