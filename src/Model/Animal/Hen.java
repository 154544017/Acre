package Model.Animal;

import DesignPattern.Structure.FlyweightFactory.GoodsFactory;
import Model.Goods.Goods;
import Model.Goods.Product;
import Model.Goods.GoodsEnum;

//母鸡
public class Hen extends Chicken {
    private static String name = "Hen";
    private static int count = 0;
    public Hen() {
        super(10,10);
    }

    @Override
    public String getSelf() {
        return name + id;
    }

    @Override
    public Product getProduct() {
        Goods egg= GoodsFactory.getInstance().getGoods(GoodsEnum.EGG);
        System.out.println(this.getClass().getSimpleName()+" harvest egg");
        return egg;
    }

    @Override
    public void eat() {
        System.out.println(name + getId() + "正在吃东西");
    }

    @Override
    public boolean isNull() {
        return false;
    }


    @Override
    public void setId() {
        this.id = count++;
    }
}
