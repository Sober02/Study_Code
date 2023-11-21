package myapi.a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
            public String toString()            返回对象的字符串表示形式
            public boolean equals(Object obj)   比较两个对象是否相等
            protected Object clone(int a)       对象克隆
         */

        //1.toString 返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@776ec8df

        Student stu = new Student("zhangsan",23);
        String str2 = stu.toString();
        System.out.println(str2);//myapi.a04objectdemo.Student@3b07d329

        //细节:
        //System:类名
        //out:静态变量
        //System.out:获取打印的对象
        //println():方法
        //参数：表示打印的内容
        //核心逻辑：
        //当我们打印一个对象的时候，底层会调用对象的toString方法，把对象变成字符串。
        //然后再打印在控制台上，打印完毕换行处理

        //思考：默认情况下，因为Object类中的toString方法返回的是地址值
        //所以，默认情况下，打印一个对象打印的就是地址值
        //但是地址值对于我们是没什么意义的
        //如果想要看到对象内部的属性值 应该如何处理
        //处理方案：重写父类的Object类中的toString方法
        System.out.println(stu);//myapi.a04objectdemo.Student@3b07d329

        //toString方法的结论：
        //如果我们打印一个对象，想要看到属性值的话，那么就重写toString方法就可以了。
        //在重写的方法中，把对象的属性值进行拼接。 （在Student类中重写了）
    }
}
