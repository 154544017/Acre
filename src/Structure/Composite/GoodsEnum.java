package Structure.Composite;

public enum GoodsEnum {
    PASTURE_SEED("PASTURE_SEED"), CORN_SEED("CORN_SEED"), POTATO_SEED("POTATO_SEED"),CABBAGE_SEED("CABBAGE_SEED"),
    PASTURE("PASTURE"), CORN("CORN"), POTATO("POTATO"),CABBAGE("CABBAGE"),
    RABBIT_CUB("RABBIT"), CHICKEN_CUB("CHICKEN"),  CATTLE_CUB("CATTLE"),
    RABBIT_HAIR ("RABBIT_HAIR"),EGG("EGG"),MILK("MILK"),BEEF("BEEF"),
    RABBIT("RABBIT"), CHICKEN("CHICKEN"), CATTLE("CATTLE");


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
