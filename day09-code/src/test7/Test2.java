package test7;

/*
要求3:通过id删除学生信息
如果存在，则删除，如果不存在，则提示删除失败。
要求4:删除完毕之后，遍历所有学生信息
要求5:查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
 */
public class Test2 {
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

        //要求3:通过id删除学生信息
        int index = getIndex(arr,3);
        if (index >= 0){
            arr[index] = null;
            System.out.println("删除成功！");
            //要求4:删除完毕之后，遍历所有学生信息
            printArr(arr);
        }else{
            System.out.println("id不存在，删除失败！");
        }
        //如果存在，则删除，如果不存在，则提示删除失败。
        queryArr(arr,2);
        printArr(arr);

    }
    //要求5:查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
    public static void queryArr(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int age = stu.getAge();
                if (stu.getId() == id) {
                    stu.setAge(age + 1);
                    System.out.println("修改成功！");
                }
            }
        }

    }

    //获取id的索引
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                if (stu.getId() == id){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //注意stu如果为null打印就会报错，此处需要判断一下
            if (stu != null) {
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge() + ", ");
            }
        }
    }
}
