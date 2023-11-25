package myapi.a08regexdemo;

public class RegexDemo5 {
    public static void main(String[] args) {
        /*
        正则表达式练习:
            需求
            请编写正则表达式验证用户名是否满足要求。
            要求:大小写字母，数字，下划线一共4-16位
            请编写正则表达式验证身份证号码是否满足要求。
            简单要求:18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
            复杂要求:按照身份证号码的格式严格要求。

            身份证号码:
            41888119930228457x
            518881197609022389
            15040119810705387X
            139133197204039024
            430102197606046442
         */

        //请编写正则表达式验证用户名是否满足要求。
        //要求:大小写字母，数字，下划线一共4-16位
        System.out.println("用户名");
        String regex1 = "[\\w]{4,16}";
        System.out.println("User1_1".matches(regex1));


        //请编写正则表达式验证身份证号码是否满足要求。
        //简单要求:18位，前17位任意数字(第一位不能为0)，最后一位可以是数字可以是大写或小写的x
        System.out.println("身份证");
        String regex2 = "[1-9]\\d{16}[\\dxX]";
        //第二种写法："[1-9]\\d{16}(\\d|x|X)"
        //String regex2 = "[1-9]\\d{16}(\\d|x|X)";
        //第三种写法："[1-9]\\d{16}(\\d|(?i)x)"
        //String regex2 = "[1-9]\\d{16}(\\d|(?i)x)";

        System.out.println("41888119930228457x".matches(regex2));
        System.out.println("518881197609022389".matches(regex2));
        System.out.println("15040119810705387X".matches(regex2));
        System.out.println("139133197204039024".matches(regex2));
        System.out.println("430102197606046442".matches(regex2));

        //忽略大小写的书写方式
        //在匹配的时候忽略abc的大小写
        String regex3 = "(?i)abc";
        System.out.println("忽略大小写的书写方式");
        System.out.println("abc".matches(regex3));
        System.out.println("abC".matches(regex3));
        System.out.println("ABC".matches(regex3));

        //忽略b的大小写
        System.out.println("忽略b的大小写");
        String regex4 = "a((?i)b)c";
        System.out.println("abc".matches(regex4));//true
        System.out.println("abC".matches(regex4));//false
        System.out.println("aBc".matches(regex4));//true


        //复杂要求:按照身份证号码的格式严格要求
        //编写正则的小心得:
        //第一步: 按照正确的数据进行拆分
        //第二步:找每一部分的规律，并编写正则表达式
        //第三步:把每一部分的正则拼接在一起，就是最终的结果
        //书写的时候: 从左到右去书写。

        //410801  1993 02 28 457x
        //前面6位: 省份，市区，派出所等信息第一位不能是0，后面5位是任意数字       [1-9]\\d{5}
        //年的前半段: 18 19 20                                               (18|19|20)
        //年的后半段: 任意数字出现两次                                         \\d{2}
        //月份:       01 ~ 09    10 11 12                                    (0[1-9]|1[0-2])
        //日期:       01 ~ 31 -> 01~09  10~19  20~29  30 31                  (0[1-9]|[12]\\d|3[01])
        //后面四位:   任意数字出现3次 最后一位可以是数字也可以是大写X或者小写x     \\d{3}[\\dxX]
        System.out.println("按照身份证号码的格式严格要求");
        String regex5 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dxX]";
        System.out.println("41888119930228457x".matches(regex5));
        System.out.println("518881197609022389".matches(regex5));
        System.out.println("15040119810705387X".matches(regex5));
        System.out.println("139133197204039024".matches(regex5));
        System.out.println("430102197606046442".matches(regex5));
    }
}
