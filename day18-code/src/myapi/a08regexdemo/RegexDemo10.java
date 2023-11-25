package myapi.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo10 {
    public static void main(String[] args) {
        //贪婪爬取和非贪婪爬取
        /*
        只写+和*表示贪婪匹配
        +? 非贪婪匹配
        *? 非贪婪匹配

        贪婪爬取:在爬取数据的时候尽可能的多获取数据
        非贪禁爬取:在爬取数据的时候尽可能的少获取数据

        ab+
        贪婪爬取: abbbbbbbbbbbb
        ab+?
        非贪婪爬取: ab
         */

        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa经历了很多版本，" +
                "目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，下一个长期支持" +
                "版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //贪婪爬取: abbbbbbbbbbbb
        String regex1 = "ab+";
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }


        //非贪婪爬取: ab
        String regex2 = "ab+?";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(s);
        while(m2.find()){
            System.out.println(m2.group());
        }
    }
}
