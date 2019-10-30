package Model.Goods;

public class Egg extends Product {
    public Egg(){
        this.description = "鸡蛋";
    }

    @Override
    public double price() {
        return 1.5;
    }
}
