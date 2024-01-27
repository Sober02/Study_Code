package myexception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //作用一:异常是用来查询bug的关键参考信息
        //作用二:异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况

        //1.创建学生对象
        Student s = new Student();
        //2.
        s.setAge(18);
        s.setAge(16);//error
        System.out.println(s.getAge());
    }
}
