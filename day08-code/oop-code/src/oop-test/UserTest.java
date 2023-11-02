public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("用户1");
        u.setPassword("123");
        u.setEmail("123@qq.com");
        u.setGender("男");
        u.setAge(18);

        System.out.println(u.getUsername());
        System.out.println(u.getPassword());
        System.out.println(u.getEmail());
        System.out.println(u.getGender());
        System.out.println(u.getAge());
    }
}
