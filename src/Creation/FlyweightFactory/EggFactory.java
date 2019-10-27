package Creation.FlyweightFactory;

import Model.Goods.Egg;
import Model.Goods.Goods;



public class EggFactory extends GoodsFactory{
    private EggFactory() {};
    private static EggFactory ourInstance = new EggFactory();
    public static EggFactory getInstance() {
        return ourInstance;
    }

    @Override
    Goods createGoods(String quality) {
        return new Egg(quality);
    }
}
