package stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        /*
        StringBuilder概述
            StringBuilder 可以看成是一个容器，创建之后里面的内容是可变的
            作用:提高字符串的操作效率
         */

        /*
        StringBuilder构造方法
        方法名                                     说明
        public StringBuilder()                创建一个空白可变字符串对象，不含有任何内容
        public StringBuilder(String str)      根据字符串的内容，来创建可变字符串对象
        StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder("abc");
         */

        /*
        StringBuilder常用方法
        方法名                                             说明
        public StringBuilder append(任意类型)       添加数据，并返回对象本身
        public StringBuilder reverse()              反转容器中的内容
        public int length()                         返回长度(字符出现的个数)
        public String toString()        通过toString()就可以实现把StringBuilder转换为String

         */

    }
}
