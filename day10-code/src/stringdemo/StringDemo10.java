package stringdemo;
//身份证信息查看
/*
7-14位: 出生年、月、日
17位: 性别(奇数男性，偶数女性)
给出身份证输出下列要求：
人物信息为:出生年月日: XXXX年X月X日
性别为: 男/女
 */
public class StringDemo10 {
    public static void main(String[] args) {
        //1.定义身份证
        String id = "441900200202105475";
        //2.截取出生年、月、日 -->  7-14
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);



        //3.截取性别  --> 17
        //要学会变通！！性别只有一位，可以用charAt
        char gender = id.charAt(16);
        //利用ASCII码表进行转换 '7' --> 7
        //'0'--->48
        //'1'--->49
        //'2'--->50
        //'3'--->51
        //'4'--->52
        //'5'--->53
        //'6'--->54
        //'7'--->55
        //'8'--->56
        //'9'--->57
        int num = gender - 48;
        char sex = ' ';
        //奇数-男 偶数-女
        if (num % 2 ==0){
            sex = '女';
        }else{
            sex = '男';
        }
        //4.拼接打印
        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年"+ month + "月"+ day + "日");
        System.out.println("性别为：" + sex);
    }
}
