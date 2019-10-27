package Model.Goods;

public class ChickenCub extends Goods {
    public ChickenCub(String quality) {
        if(quality.equals("low")) {
            price = 1;
            weight = 1;
        } else if(quality.equals("high")) {
            price = 2;
            weight = 2;
        }
    }
}
