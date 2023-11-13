package a01innerclassdemo1;

public class Outer {
    private int a = 10;

     class Inner{
        private int a = 20;

        public void show(){
            int a = 30;
            //面试题
//            System.out.println(??);//10
//            System.out.println(??);//20
//            System.out.println(??);//30
            System.out.println(a);//30
            System.out.println(this.a);//20
            //Outer.this 获取了外部类对象的地址值
            System.out.println(Outer.this.a);//10
        }
    }

    //创建私有的内部类对象方法
//    public Inner getInstance(){
//        return new Inner();
//    }


}
