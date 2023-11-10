package Advanceoop.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){

    }
    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        //获取最大年龄
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i).getAge();
            if (temp > max){
                max = temp;
            }
        }
        return max;
    }
}
