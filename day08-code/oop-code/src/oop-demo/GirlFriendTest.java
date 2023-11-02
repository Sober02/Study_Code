public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf1 = new GirlFriend();
        //赋值
        gf1.setName("小莉莉");
        gf1.setAge(18);
        gf1.setCharacter("善良");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getCharacter());

        gf1.sleep();
        gf1.eat();
    }
}
