package test7;

/*
定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同
学生的属性:学号，姓名，年龄。
要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
要求2:添加完毕之后，遍历所有学生信息。
要求3:通过id删除学生信息
如果存在，则删除，如果不存在，则提示删除失败。
要求4:删除完毕之后，遍历所有学生信息
要求5:查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.定义一个长度为3的数组
        Student[] arr = new Student[3];
        //2.创建1~3名学生对象 --- 学生对象的学号，姓名各不相同
        Student stu1 = new Student(1, "小明", 20);
        Student stu2 = new Student(2, "小东", 22);
        Student stu3 = new Student(3, "小亮", 23);

        //3.将学生对象存入数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //4.要求1:再次创建一个学生对象 - 添加进数组 - 要判断数组是否已满
        Student stu4 = new Student(4, "小莉", 21);

        //注意思路顺序：应该先判断学号唯一性，再进行添加！

        //5.学号的唯一性判断 - 定义方法判断
        boolean flag = contains(arr, stu4.getId());


        //4.1 数组满了需要创建新数组
        /*if (count == arr.length) {
        }*/
        //5.1 id存在 - 提示：id已经存在，请修改id重新添加
        if (flag) {
            System.out.println("id已经存在，请修改id重新添加");
        } else {
            //5.2 id不存在 添加进数组
            //4.2 数组没满
            //[stu1,stu2,nul1]
            // getCount获取到的是2，表示数组当中已经有了2个元素
            // 还有一层意思:如果下一次要添加数据，就是添加到2索引的位置
            int count = getCount(arr);
            if (count < arr.length) {
                for (int i = 0; i < arr.length; i++) {
                    Student stu = arr[i];
                    arr[count] = stu4;
                }
                //要求2:添加完毕之后，遍历所有学生信息。
                printArr(arr);
            } else {//数组存满 创建新数组存入
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;
                //要求2:添加完毕之后，遍历所有学生信息。
                printArr(newArr);
                /*System.out.println("请输入要删除的学生信息的id");
                Scanner sc = new Scanner(System.in);
                int id = sc.nextInt();
                deleteStuInfo(newArr,id);
                printArr(newArr);*/
            }
        }
    }
    //通过id删除学生信息
    //需要 - 数组  id
    //无需返回
    /*public static void deleteStuInfo(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //id存在 - 删除信息
            if (stu.getId() == id){
                arr[i] = null;
                System.out.println("删除成功");
                break;
            }
            //id不存在 - 提示删除失败
            if ( i == arr.length -1) {
                System.out.println("id不存在，删除失败");
            }
        }
    }*/

    //定义方法打印数组 因为要分两种情况打印，所以定义方法
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //注意stu如果为null打印就会报错，此处需要判断一下
            if (stu != null) {
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge() + ", ");
            }
        }
    }

    //定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        //判断数组是否满了
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                count++;
            }
        }
        return count;
    }

    //判断学号唯一性
    //需要： 数组  id
    //返回一个结果 - true(存在)  false(不存在)
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (stu.getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    //创建新数组
    //把老数组元素拷贝到新数组中。
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环遍历得到老数组中每一个元素
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
