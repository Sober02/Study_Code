package test6;

/*
定义数组存储4个女朋友的对象
女朋友的属性:姓名、年龄、性别、爱好
要求1:计算出四个女朋友的平均年龄
要求2:统计年龄比平均值低的女朋友有几个?并把她们的所有信息打印出来
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        //1.定义数组
        GirlFriend[] gfArr = new GirlFriend[4];
        //2.创建对象-定义4个女朋友属性
        GirlFriend gf1 = new GirlFriend("小莉莉", 18, '女', "杨诗雨");
        GirlFriend gf2 = new GirlFriend("小莉莉2", 22, '女', "杨诗雨2");
        GirlFriend gf3 = new GirlFriend("小莉莉3", 24, '女', "杨诗雨3");
        GirlFriend gf4 = new GirlFriend("小莉莉4", 26, '女', "杨诗雨4");

        //3.将对象存入数组
        gfArr[0] = gf1;
        gfArr[1] = gf2;
        gfArr[2] = gf3;
        gfArr[3] = gf4;

        //4.遍历数组统计年龄sum
        int sum = 0;
        for (int i = 0; i < gfArr.length; i++) {
            GirlFriend gf = gfArr[i];
            sum = sum + gf.getAge();
        }
        //System.out.println(sum);
        //5.求出平均年龄
        double avg = sum * 1.0 / gfArr.length;
        System.out.println("4个女朋友的平均年龄是：" + avg);
        //6.打印年龄比平均年龄低的女朋友信息，统计个数count
        int count = 0;
        for (int i = 0; i < gfArr.length; i++) {
            GirlFriend gf = gfArr[i];
            if (gf.getAge() < avg) {
                System.out.println("姓名：" + gf.getName() + " " + "年龄：" + gf.getAge() + " " + "性别：" + gf.getGender() + " " + "爱好：" + gf.getHobby());
                count++;
            }
        }
        System.out.println("比平均年龄低的有" + count + "个");
    }
}
