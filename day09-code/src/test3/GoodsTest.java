package test3;

public class GoodsTest {
    public static void main(String[] args) {
        //定义数组存储3个商品对象
        Goods[] goodsArr = new Goods[3];

        Goods g1 = new Goods("001", "苹果手机", 8888.0, 100);
        Goods g2 = new Goods("002", "小米电视", 6666.0, 50);
        Goods g3 = new Goods("003", "洗衣机", 688.0, 100);

        //存入数组
        goodsArr[0] = g1;
        goodsArr[1] = g2;
        goodsArr[2] = g3;

        //遍历
        for (int i = 0; i < goodsArr.length; i++) {
            Goods goods = goodsArr[i];
            System.out.println(goods.getId() + " " + goods.getName() + " " + goods.getPrice() + " " + goods.getCount());
        }
    }
}
