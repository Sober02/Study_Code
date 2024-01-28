package myio.mycharstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("day28-code\\b.txt");

        fw.write("我的同学都很厉害\r\n");
        fw.write("说话声音好听\r\n");
        fw.write("个个都是奇才\r\n");
        fw.write("我很喜欢这里\r\n");

        fw.flush();
        fw.write("asdfg");

        fw.close();

    }
}
