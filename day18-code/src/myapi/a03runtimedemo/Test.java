package myapi.a03runtimedemo;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("shutdown -a");
        } catch (IOException e) {
            e.printStackTrace();
        }

        new MyJframe();
    }
}
