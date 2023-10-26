public class demo1 {
    public static void main(String[] args){
        //逻辑运算符
        //短路逻辑运算符
        //&&    短路与     结果和&相同，但是有短路效果
        //||    短路或     结果和|相同，但是有短路效果
        /* 注意事项：
            &|    无论左边是true或FALSE，右边都要执行！
            &&||  如果左边能确定整个表达式的结果，则右边不执行！
            &&    左边如果是false，右边不管真假都不执行，表达式的结果为false！
            ||    左边如果是true，右边不管真假都不执行，表达式的结果位true！
            这两种情况下，右边不执行，提高了效率

            最常用的逻辑运算符：&&，||，！
         */
        //1.&&短路与
        //两边都为真，结果才为真
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        //2.||短路或
        //两边都为假，结果才为假
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        //3.短路逻辑运算符具有短路效果
        //当左边表达式能确定最终结果，那么右边表达式就不会执行
        int a =10;
        int b =10;
        boolean result = ++a < 5 && ++b <5;//左边是false 右边不执行
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//10


    }
}
