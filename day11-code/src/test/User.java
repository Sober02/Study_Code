package test;

public class User {
    //私有化成员变量
    private String id;
    private String username;
    private String password;

    //空参构造
    public User() {

    }

    //全参构造
    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    //get和set方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
