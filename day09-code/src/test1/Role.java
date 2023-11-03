package test1;

import java.util.Random;

/*
    文字版格斗游戏
        这些信息格斗游戏，每个游戏角色的姓名，血量，都不相同，
        在选定人物的时候 (new对象的时候)，就应该被确定下来。
        role1:姓名为:乔峰   血量为:100
        role2:姓名为:鸠摩智 血量为:100
        对战：
        乔峰举起拳头打了鸠摩智一下，造成了XX点伤害，鸠摩智还剩下XXX点血。
        鸠摩智举起拳头打了鸠摩智一下，造成了XX点伤害，乔峰还剩下XXX点血。
 */
public class Role {
    //属性
    private String name;
    private int blood;

    //空参
    public Role() {

    }

    //带全部参数的构造
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    //get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法攻击
    //role r1 = new role();
    //role r2 = new role();
    //r1.攻击(r2);
    //方法的调用者去攻击参数
    public void attack(Role role) {
        //定义伤害数值 - 随机
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量做一个验证，如果为负数了，就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改一下挨揍的人的血量
        role.setBlood(remainBlood);
        //this - 方法的调用者
        System.out.println(this.getName() + "举起拳头打了" + role.getName() + "一下，造成了"
                + hurt +"点伤害，"+ role.getName() + "还剩下"+ (remainBlood) +"点血。");
    }
}
