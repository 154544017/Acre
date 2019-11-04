package Model.Goods;

/**
 * 表示货物类型的枚举类
 * 植物分为种子和成熟后的作物，动物分为幼崽，副产品和成熟后的肉产品
 */
public enum GoodsEnum {
    PASTURE_SEED("PASTURE_SEED"), CORN_SEED("CORN_SEED"), POTATO_SEED("POTATO_SEED"),CABBAGE_SEED("CABBAGE_SEED"),
    PASTURE("PASTURE"), CORN("CORN"), POTATO("POTATO"),CABBAGE("CABBAGE"),
    RABBIT_CUB("RABBIT_CUB"), CHICKEN_CUB("CHICKEN_CUB"),  CATTLE_CUB("CATTLE_CUB"),
    RABBIT_HAIR ("RABBIT_HAIR"),EGG("EGG"),MILK("MILK"),BEEF("BEEF"),
    RABBIT("RABBIT"), CHICKEN("CHICKEN"), CATTLE("CATTLE"),HYBRIDCORN("HYBRIDCORN"),HYBRIDCORN_SEED("HYBRIDCORN_SEED");


    private String tag;
    GoodsEnum(String tag){
        this.tag = tag;
    }

    public static GoodsEnum getStockGoodsByTag(String tag){
        for(GoodsEnum goodsEnum : values()){
            if(goodsEnum.tag.equals(tag))
                return goodsEnum;
        }
        return null;
    }
}
