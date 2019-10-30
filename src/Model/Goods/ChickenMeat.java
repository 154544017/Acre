package Model.Goods;

public class ChickenMeat extends Product {
    public ChickenMeat(){
        this.description = "鸡肉";
    }

    @Override
    public double price() {
        return 18;
    }
}
