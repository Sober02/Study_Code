package a04treemap;

import java.util.Objects;

public class Student1 implements Comparable<Student1>{
    private String name;
    private int age;


    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



    public String toString() {
        return "Student1{name = " + name + ", age = " + age + "}";
    }


    //按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
    //this: 表示当前要添加的元素
    //o: 表示已经在红黑树中存在的元素
    //返回值:
    // 负数;表示当前要添加的元素是小的，存左边
    // 正数: 表示当前要添加的元素是大的，存右边
    // 0: 表示当前要添加的元素已经存在，舍弃
    @Override
    public int compareTo(Student1 o) {
        int i = this.getAge() - o.getAge();
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
