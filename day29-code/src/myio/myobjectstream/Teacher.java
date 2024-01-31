package myio.myobjectstream;

import java.io.Serial;
import java.io.Serializable;


/*
 * Serializable接口里面是没有抽象方法，标记型接口
 * 一旦实现了这个接口，那么就表示当前的Teacher类可以被序列化
 * 理解:
 *   一个物品的合格证
 *
 */
public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUID = 8328744411681904854L;
    private String name;
    private int age;
    //transient:瞬态关键字
    //作用：不会把当前属性序列化到本地文件中
    private transient String address;


    public Teacher() {
    }

    public Teacher(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
