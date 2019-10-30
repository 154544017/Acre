package Model.Goods;

public class PotatoVeg extends Product {

    public PotatoVeg(){
        this.description = "土豆";
    }

    @Override
    public double price() {
        return 2.2;
    }
}
