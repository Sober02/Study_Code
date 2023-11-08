package test;

public class Book {
    //属性：编号，书名，作者，价格
    private String id;
    private String bookName;
    private String writer;
    private String price;

    //2、图书的价格可以定义为字符串类型，因为在键盘录入时，
    // 不可以先使用nextInt()方法获取整数,然后再使用next()方法获取字符串，
    // 这样会导致next()方法获取不到数据。

    public Book(String id, String bookName, String writer, String price) {
        this.id = id;
        this.bookName = bookName;
        this.writer = writer;
        this.price = price;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
