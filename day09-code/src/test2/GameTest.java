package test2;

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
public class GameTest {
    public static void main(String[] args) {
        //new 两个角色
        //定义角色属性
        Role r1 = new Role("乔峰",100,'男');
        Role r2 = new Role("鸠摩智",100,'男');

        //展示角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();
        //调用方法pk
        while (true) {
            //r1攻击r2
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            //r2攻击r1
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
