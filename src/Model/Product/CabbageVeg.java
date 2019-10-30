package Model.Product;

public class CabbageVeg extends Product {
    public CabbageVeg(){
        this.description = "白菜";
    }

    @Override
    public double price() {
        return 0.3;
    }
}
