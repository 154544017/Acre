package Model.Animal;

import Creation.FlyweightFactory.GoodsFactory;
import Model.Goods.Goods;
import Model.Goods.Product;
import Model.State.State;
import Structure.Composite.GoodsEnum;

public class Cow extends Cattle {
    private static String name = "Cow";
    private static int count = 0;
    public Cow() {
        super( 10, 5);
    }

    @Override
    public String getSelf() {
        return null;
    }

    @Override
    public Product getProduct() {
        Goods hair= GoodsFactory.getInstance().getGoods(GoodsEnum.MILK);
        System.out.println(this.getClass().getSimpleName()+" harvest milk");
        return hair;
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
    public void show() {
        System.out.println("我是" + name + getId());
    }

    @Override
    public void setId() {
        this.id = count++;
    }
}
