package a05myset;

public class A02_HashSetDemo1 {
    public static void main(String[] args) {
/*
        哈希值:
            对象的整数表现形式
            1，如果没有重写hashCode方法，计算出的哈希值是不同的
            2，如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
            3，但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰撞)
*/

        //1.如果没有重写hashCode方法，计算出的哈希值是不同的
        //Student1,没有重写hashCode方法
        //1.创建对象
        Student1 s11 = new Student1("张三",23);
        Student1 s12 = new Student1("张三",23);

        System.out.println(s11.hashCode());//1324119927
        System.out.println(s12.hashCode());//990368553

        //2.如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        //Student2,重写了hashCode方法
        Student2 s21 = new Student2("张三",23);
        Student2 s22 = new Student2("张三",23);

        System.out.println(s21.hashCode());//24022543
        System.out.println(s22.hashCode());//24022543

        //3.在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。
        // (哈希碰撞)
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354
    }
}
