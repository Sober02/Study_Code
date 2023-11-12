package Advanceoop.a01polymorphicdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(22);

        Administrator admin = new Administrator();
        admin.setName("管理员");
        admin.setAge(33);

        register(s);
        register(t);
        register(admin);

    }

    public static void register(Person p){
        p.show();
    }
}
