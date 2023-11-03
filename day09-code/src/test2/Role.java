package test2;

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
    private char gender;
    private String face;//长相是随机的

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //空参
    public Role() {

    }

    //带全部参数的构造
    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(gender);
    }

    //get和set方法
    //获取随机长相
    public void setFace(char gender){
        Random r = new Random();
        if (gender == '男'){
            int Index = r.nextInt(boyfaces.length);
            this.face = boyfaces[Index];
        }else if (gender == '女'){
            int Index = r.nextInt(girlfaces.length);
            this.face = girlfaces[Index];
        }else{
            this.face = "面目狰狞";
        }
    }
    public String getFace(){
        return face;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }

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

    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };
    //定义一个方法攻击
    //role r1 = new role();
    //role r2 = new role();
    //r1.攻击(r2);
    //方法的调用者去攻击参数
    public void attack(Role role) {
        //定义伤害数值 - 随机
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        //定义进攻的随机索引
        int Index = r.nextInt(attacks_desc.length);
        //定义String KongFu存储随机到的招式
        String KongFu = attacks_desc[Index];
        //souf打印招式,进攻方是this.name,承受方是role.name
        System.out.printf(KongFu,this.getName(),role.getName());
        System.out.println();
        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量做一个验证，如果为负数了，就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改一下挨揍的人的血量
        role.setBlood(remainBlood);
        //受伤描述 - 分为8种状态
        //HP > 90 使用0索引
        //HP80~90 使用1索引
        //HP70~80 使用2索引
        //HP60~70 使用3索引
        //HP40~60 使用4索引
        //HP20~40 使用5索引
        //HP10~20 使用6索引
        //HP < 10 使用7索引
        if (remainBlood > 90){
            System.out.printf(injureds_desc[0],role.getName());
        }else if (remainBlood >80 && remainBlood <=90){
            System.out.printf(injureds_desc[1],role.getName());
        }else if (remainBlood >70 && remainBlood <=80){
            System.out.printf(injureds_desc[2],role.getName());
        }else if (remainBlood >60 && remainBlood <=70){
            System.out.printf(injureds_desc[3],role.getName());
        }else if (remainBlood >40 && remainBlood <=60){
            System.out.printf(injureds_desc[4],role.getName());
        }else if (remainBlood >20 && remainBlood <=40){
            System.out.printf(injureds_desc[5],role.getName());
        }else if (remainBlood >10 && remainBlood <=20){
            System.out.printf(injureds_desc[6],role.getName());
        }else{
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();
    }
    //展示角色信息
    public void showRoleInfo(){
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getFace());
    }
}
