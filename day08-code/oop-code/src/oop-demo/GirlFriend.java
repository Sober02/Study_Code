public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String character;

    //针对于每一个私有化的成员变量，都要提供get和set方法
    // set方法:给成员变量赋值
    // get方法: 对外提供成员变量的值

    //作用: 给成员变量name进行赋值的
    public void setName(String name){
        this.name = name;
    }
    //作用: 对外提供name属性的
    public String getName(){
        return name;
    }

    //age
    //setAge：给成员变量age赋值
    //getAge：对外提供成员变量age的值
    public void setAge(int year){
        if (year >= 18 && year <= 50){
            age = year;
        }else{
            System.out.println("输入了非法数据");
        }
    }
    public int getAge(){
        return age;
    }

    //character
    //setCharacter：给成员变量character赋值
    //getCharacter：对外提供成员变量character的值
    public void setCharacter(String character){
        this.character = character;
    }
    public String getCharacter(){
        return character;
    }

    //行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("吃饭");
    }
}
