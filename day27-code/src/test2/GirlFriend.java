package test2;

public class GirlFriend {
    private String name;
    private int age;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
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
        //姓名的长度在 3 - 10之间
        if (name.length() < 3 || name.length() > 10){
            throw new NameFormatException(name + "的格式有误，长度要在3-10之间");
        }else {
            this.name = name;
        }
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
        //年龄的范围为 18 - 30岁
        //NumberFormatException
        if (age < 18 || age > 30){
            throw new AgeOutOfBoundsException(age + "不在符合的范围内，正确范围在18-30之间");
        }else {
            this.age = age;
        }
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}
