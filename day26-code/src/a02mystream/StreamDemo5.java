package a02mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //一堆零散数据   public static<T> stream<T> of(T.. values)    stream接口中的静态方法

        Stream.of(1,2,3,4,5,6).forEach(i -> System.out.println(i));

        System.out.println("-------------------");

        Stream.of("a","b","c").forEach(s -> System.out.println(s));
    }
}
