package test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        Staff s1 = new Staff("张三",3000);
        Staff s2 = new Staff("李四",3500);
        Staff s3 = new Staff("王五",4000);
        Staff s4 = new Staff("赵六",4500);
        Staff s5 = new Staff("田七",5000);

        ArrayList<Staff> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        for (int i = 0; i < list.size(); i++) {
            Staff staff = list.get(i);
            if (staff.getName().equals("王五")){
                staff.setName("王小五");
            }
            if (staff.getName().equals("赵六")){
                list.remove(i);
            }
            if (staff.getName().equals("田七")){
                staff.setWages(staff.getWages() + 500);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Staff s = list.get(i);
            System.out.println(s.getName() + ", " + s.getWages());
        }
    }
}
