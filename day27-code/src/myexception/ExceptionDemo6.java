package myexception;

public class ExceptionDemo6 {
    public static void main(String[] args) {
     /*
        自己处理 (捕获异常) 灵魂四问:
            灵魂一问:如果try中没有遇到问题，怎么执行?
            灵魂二问:如果try中可能会遇到多个问题，怎么执行?
            灵魂三问:如果try中遇到的问题没有被捕获，怎么执行?
            灵魂四问:如果try中遇到了问题，那么try下面的其他代码还会执行吗?
     */

        /*灵魂二问:如果try中可能会遇到多个问题，怎么执行?
                会写多个catch与之对应
                细节：
                    如果我们要捕获多个异常，这些异常中如果存在父子关系，那么父类一定要写在下面

                了解性:
                    在JDK7之后，我们可以在catch中同时捕获多个异常，中间用|进行隔开
                    表示如果出现了A异常或者B异常的话，采取同一种处理方案
         */

        int[] arr = {1,2,3,4,5,6};

        /*try{
            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
            System.out.println(2/0);//ArithmeticException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");//索引越界了
        }

        System.out.println("看看我执行了吗");//看看我执行了吗*/

        try{
            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
            System.out.println(2/0);//ArithmeticException
            String s = null;
            System.out.println(s.equals("aaa"));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("Exception");
        }

        System.out.println("看看我执行了吗");
    }
}
