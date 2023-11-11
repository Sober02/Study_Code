package Advanceoop.a09oop_extends_demo4;

public class Employee {
    //1.类名见名知意
    //2.所有的成员变量都需要私有 属性： 工号，姓名，工资
    //3.构造方法（空参  带全部参数的构造）
    //4.get/set
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工正在工作");
    }

    public void eat(){
        System.out.println("在吃饭");
    }
}
