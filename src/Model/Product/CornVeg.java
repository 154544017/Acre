package Model.Product;

public class CornVeg extends Product {
    public CornVeg(){
        this.description = "玉米";
    }

    @Override
    public double price() {
        return 1.23;
    }
}
