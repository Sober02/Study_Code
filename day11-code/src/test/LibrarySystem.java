package test;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {





        Scanner sc = new Scanner(System.in);
        //定义一个集合存放图书对象
        ArrayList<Book> list = new ArrayList<>();
        while (true) {
            //1.提供操作菜单，可以选择要进行的操作。
            System.out.println("-------------------欢迎来到图书管理系统-------------------");
            System.out.println("请选择操作：1.添加图书 2.查询图书 3.删除图书 4.修改图书 5.退出系统");
            String choose = sc.next();
            switch (choose) {
                case "1" -> addBook(list);
                case "2" -> queryBook(list);
                case "3" -> deleteBook(list);
                case "4" -> modifyBook(list);
                //7、可以退出系统，结束程序运行。
                case "5" -> {
                    System.out.println("已退出，谢谢使用！");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单
    private static void modifyBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入需要修改图书的编号");
            String bid = sc.next();
            //判断编号
            int index = getIndex(list, bid);
            if (index == -1){
                System.out.println("编号不存在，请重新输入！");
                continue;
            }
            //运行到这里说明编号存在
            Book book = list.get(index);
            System.out.println("请输入需要修改的书名");
            String changeBookName = sc.next();
            book.setBookName(changeBookName);
            System.out.println("请输入需要修改的作者");
            String changeWriter = sc.next();
            book.setWriter(changeWriter);
            System.out.println("请输入需要修改的价格");
            String changePrice = sc.next();
            book.setPrice(changePrice);

            //提示修改成功
            System.out.println("修改成功！");
            break;
        }
    }

    //5、可以删除图书，通过编号删除，删除成功后，返回到菜单.
    private static void deleteBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的图书编号");
        //判断编号是否存在
        String bid = sc.next();
        boolean flag = contains(list, bid);
        if (!flag){
            //不存在 - 提示
            System.out.println("编号不存在，删除失败");
            return;
        }
        //存在 - 删除
        int index = getIndex(list, bid);
        list.remove(index);
        System.out.println("删除成功！");
    }

    //3、可以查询图书，显示所有图书信息，然后返回到菜单。
//4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
    private static void queryBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            System.out.println("请选择:1.查询所有图书信息 2.输入书名查询单本图书信息 3.退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> printAllInfo(list);
                case "2" -> printSingleInfo(list);
                case "3" -> {
                    System.out.println("查询结束!");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void printSingleInfo(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入图书的书名");
            String bookName = sc.next();
            for (int i = 0; i < list.size(); i++) {
                Book book = list.get(i);
                if (book.getBookName().equals(bookName)) {
                    //返回真 打印该图书信息
                    System.out.println(book.getId() + ", " + book.getBookName() +
                            ", " + book.getWriter() + ", " + book.getPrice());
                    return;
                } else {
                    //返回假 提示
                    System.out.println("没有这本书，请重新输入书名");
                    continue;
                }
            }
        }
    }

    private static void printAllInfo(ArrayList<Book> list) {
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            System.out.println(book.getId() + ", " + book.getBookName() +
                    ", " + book.getWriter() + ", " + book.getPrice());
        }
    }

    //编号，书名，作者，价格
    private static void addBook(ArrayList<Book> list) {
        //编号唯一 -> 定义方法判断id是否唯一
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入图书编号");
            String bid = sc.next();
            boolean flag = contains(list, bid);
            if (flag) {
                System.out.println("编号已存在，请重新输入编号");
                continue;
            }
            //编号不存在继续输入信息
            System.out.println("请输入书名");
            String bookName = sc.next();

            System.out.println("请输入作者");
            String writer = sc.next();

            System.out.println("请输入价格");
            String price = sc.next();

            //信息录入完成，创建对象
            Book book = new Book(bid, bookName, writer, price);
            //将对象添加进集合
            list.add(book);
            //添加成功，返回菜单
            System.out.println("添加成功！");
            break;
        }

    }

    private static boolean contains(ArrayList<Book> list, String id) {
        return getIndex(list,id)>=0;
    }
    private static int getIndex(ArrayList<Book> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
