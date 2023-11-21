package myapi.a04objectdemo;

import java.util.StringJoiner;

//Cloneable --- 接口里面没有抽象方法
//如果一个接口里面没有抽象方法
//表示当前的接口是一个标记性的接口
//现在Cloneable表示一旦实现了，那么当前类的对象就可以被克隆
//如果没有实现，当前类的对象就不能克隆
public class User implements Cloneable{
    //属性：id  用户名  密码  游戏图片  游戏进度
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "角色编号为：" + id + ", 用户名：" + username + ", 密码：" + password + ", 游戏图片：" + path + ", 进度：" + arrToString();
    }

    public String arrToString(){
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < data.length; i++) {
                  sj.add(data[i] + "");
        }
        return sj.toString();
    }

    //因为clone()方法受保护，不能直接调用，所以要重写方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于让Java帮我们克隆一个对象，并把克隆之后的对象返回

        //改为深克隆
        //1.先把被克隆对象中的数组获取出来
        int[] data = this.data;
        //2.创建新数组
        int[] newData = new int[data.length];
        //3.然后再将其赋值给新的数组
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        //调用父类中的方法克隆对象
        User u = (User) super.clone();
        //因为父类中的克隆方法是浅克隆，所以要替换克隆出来对象中的数组地址值
        u.data = newData;
        return u;
    }


}
