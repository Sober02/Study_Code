package test;


public class Test6 {
    public static void main(String[] args) {
        /*
         给你一个字符串s，由若干单词组成，单词前后用一些空格字符隔开。
         返回字符串中最后一个单词的长度。
         单词是指仅由字母组成、不包含任何空格字符的最大子字符串。

            示例 1:输入: s ="Hello World"输出: 5
            解释: 最后一个单词是“world”，长度为5。

            示例 2:输入:s ="fly me to the moon"输出:4
            解释: 最后一个单词是“moon”，长度为4。

            示例 3: 输入: s ="luffy is still joyboy'
            解释: 最后一个单词是长度为6的“joyboy”。
*/
        String str = "Hello World";
        String word = "";
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            word = c + word ;
            if (c == ' '){
                break;
            }
            count++;
        }
        System.out.println("最后一个单词是" + word +  "长度为" + count );
    }
}
