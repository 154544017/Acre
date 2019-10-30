package Model.Product;

public class Beef extends Product {

    public Beef(){
        this.description = "牛肉";
    }

    @Override
    public double price() {
        return 55;
    }


}
