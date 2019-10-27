package Creation.FlyweightFactory;

import Model.Goods.ChickenCub;
import Model.Goods.Goods;

public class ChickenCubFactory extends GoodsFactory{
    private static ChickenCubFactory ourInstance = new ChickenCubFactory();

    public static ChickenCubFactory getInstance() {
        return ourInstance;
    }

    private ChickenCubFactory() {
    }

    @Override
    Goods createGoods(String quality) {
        return new ChickenCub(quality);
    }
}
