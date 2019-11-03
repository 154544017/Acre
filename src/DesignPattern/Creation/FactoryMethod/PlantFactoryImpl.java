package DesignPattern.Creation.FactoryMethod;

import Model.Plant.Plant;
import Model.Goods.GoodsEnum;

public class PlantFactoryImpl {
    private PlantFactory plantFactory;
    private PlantFactoryImpl(){}
    private static PlantFactoryImpl ourInstance;

    public static PlantFactoryImpl getInstance() {
        if (ourInstance == null){
            ourInstance = new PlantFactoryImpl();
        }
        return ourInstance;
    }

    public PlantFactoryImpl setPlantFactory(GoodsEnum goodsEnum){
        if(goodsEnum == GoodsEnum.CORN_SEED){
            plantFactory = new CornFactory();
        }else if(goodsEnum == GoodsEnum.CABBAGE_SEED){
            plantFactory = new ChineseCabbageFactory();
        }else if(goodsEnum == GoodsEnum.POTATO_SEED){
            plantFactory = new PotatoFactory();
        }else if(goodsEnum == GoodsEnum.PASTURE_SEED){
            plantFactory = new PastureFactory();
        }
        else if(goodsEnum == GoodsEnum.HYBRIDCORN_SEED){
            plantFactory = new HybridCornFactory();

        }
        return this;
    }

    public Plant createPlant(){
        return plantFactory.createPlant();
    }
}
