package Model.Animal;

import DesignPattern.Structure.FlyweightFactory.GoodsFactory;
import Model.Goods.Goods;
import Model.Goods.Product;
import Model.Goods.GoodsEnum;

public abstract class Rabbit extends Animal{

    public Rabbit(int growthTime, int feedAmount) {
        super(growthTime, feedAmount);
    }
    public Product getProduct() {
        Goods hair=GoodsFactory.getInstance().getGoods(GoodsEnum.RABBIT_HAIR);
        System.out.println(this.getClass().getSimpleName()+" harvest rabbit_hair");
        return hair;
    }
}
