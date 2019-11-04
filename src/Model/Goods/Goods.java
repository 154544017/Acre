package Model.Goods;


import Util.MyUtils;

/**
 * 使用了享元模式
 * 将Goods的创建由GoodsFactory管理
 */
public class Goods extends Product {
    private double price;
    private GoodsEnum goodsEnum;

    /**
     * 构造方法
     * @param goodsEnum1 表示货物的种类
     */
    public Goods(GoodsEnum goodsEnum1) {
        MyUtils.getModifierString(this,null,"Goods");
        this.goodsEnum = goodsEnum1;
        price = -1;
        description = goodsEnum1.toString();
        System.out.println("创建"+goodsEnum1);
    }

    /**
     * 设定货物的价格
     * @param price1 表示货物的价格
     */
    public void setPrice(double price1) {
        price = price1;
    }

    public void show() {
        System.out.println("我是"+goodsEnum);
        System.out.println("价格为"+price);
    }

    public GoodsEnum getGoodsEnum() {
        return goodsEnum;
    }

    @Override
    public double price() {
        return price;
    }
}
