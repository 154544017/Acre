package Model.Product;

public class GrassVeg extends Product {
    public GrassVeg(){
        this.description = "牧草";
    }

    @Override
    public double price() {
        return 0.5;
    }
}
