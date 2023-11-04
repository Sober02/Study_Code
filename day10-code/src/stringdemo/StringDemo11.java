package stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {

        //1.获取到说的话
        String talk = "你玩的真好，以后不要再玩了，FW,TMD,SB";

        //2.定义一个敏感词库
        String[] arr = {"TMD", "SB", "CNM", "MLGB", "FW"};

        //3.循环得到数组中的每一个敏感词，依次替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");

        }

        //3.打印结果
        System.out.println(talk);

    }
}
