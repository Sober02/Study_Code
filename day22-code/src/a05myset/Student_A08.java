package a05myset;

public class Student_A08 implements Comparable<Student_A08>{
    //属性:(姓名,年龄，语文成绩,数学成绩,英语成绩),
    private String name;
    private int age;
    private int Chinese;
    private int Math;
    private int English;


    public Student_A08() {
    }

    public Student_A08(String name, int age, int Chinese, int Math, int English) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.Math = Math;
        this.English = English;
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

    /**
     * 获取
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return Math
     */
    public int getMath() {
        return Math;
    }

    /**
     * 设置
     * @param Math
     */
    public void setMath(int Math) {
        this.Math = Math;
    }

    /**
     * 获取
     * @return English
     */
    public int getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(int English) {
        this.English = English;
    }

    public String toString() {
        return "Student_A08{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", Math = " + Math + ", English = " + English + "}";
    }

    /*
    按照总分从高到低输出到控制台
            如果总分一样，按照语文成绩排
            如果语文一样，按照数学成绩排
            如果数学成绩一样，按照英语成绩排
            如果英文成绩一样，按照年龄排
            如果年龄一样，按照姓名的字母顺序排排
            如果都一样，认为是同一个学生，不存。
     */
    @Override
    public int compareTo(Student_A08 o) {
        int sum1 = o.getChinese() + o.getMath() + o.getEnglish();
        int sum2 = this.getChinese() + this.getMath() + this.getEnglish();
        //因为是降序排序，所以用红黑树中的元素减去要添加的元素
        int i = sum1 - sum2;
        //如果总分一样，按照语文成绩排
        i = i == 0 ? o.getChinese() - this.getChinese() : i;
        //如果语文一样，按照数学成绩排
        i = i == 0 ? o.getMath() - this.getMath() : i;
        //如果数学成绩一样，按照英语成绩排(可以省略不写）
        i = i == 0 ? o.getEnglish() - this.getEnglish() : i;
        //如果英文成绩一样，按照年龄排
        i = i == 0 ? o.getAge() - this.getAge() : i;
        //如果年龄一样，按照姓名的字母顺序排排
        i = i == 0 ? o.getName().compareTo(this.getName()) : i;

        return i;
    }
}
