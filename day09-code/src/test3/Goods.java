package test3;

/*
定义数组存储3个商品对象。
商品的属性:商品的id，名字，价格，库存。
创建三个商品对象，并把商品对象存入到数组当中
 */
public class Goods {
    //属性
    private String id;
    private String name;
    private double price;
    private int count;

    //空参
    public Goods() {

    }

    //带全参的构造
    public Goods(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    //get和set方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
