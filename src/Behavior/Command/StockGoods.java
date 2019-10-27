package Behavior.Command;

public enum StockGoods {
    PASTURE("PASTURE"), CORN("CORN"), POTATO("POTATO"),
    CABBAGE("CABBAGE"), RABBIT("RABBIT"), CHICKEN("CHICKEN"), OX("OX");

    private String tag;
    StockGoods(String tag){
        this.tag = tag;
    }

    public static StockGoods getStockGoodsByTag(String tag){
        for(StockGoods stockGoods : values()){
            if(stockGoods.tag.equals(tag))
                return stockGoods;
        }
        return null;
    }
}
