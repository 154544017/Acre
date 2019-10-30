package Model.Goods;

import Structure.Composite.GoodsEnum;


public class Goods extends Product{
//    private String name;
    private int price;
//    private int weight;
    private GoodsEnum goodsEnum;

    /**
     * price -1 表示这个价格暂时不可用，只是初始化的值
     * @param goodsEnum1
     */
    public Goods(GoodsEnum goodsEnum1) {
        goodsEnum = goodsEnum1;
        price = -1;
        description = goodsEnum1.toString();
        System.out.println("创建"+goodsEnum1);
    }

    public void setPrice(int price1) {
        price = price1;
    }
    public void show() {
        System.out.println("我是"+goodsEnum);
        System.out.println("价格为"+price);
    }


    @Override
    public double price() {
        return price;
    }
}
