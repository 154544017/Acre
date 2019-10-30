package Model.Product;

public class RabbitHair extends Product {
    public RabbitHair(){
        this.description = "兔毛";
    }

    @Override
    public double price() {
        return 70;
    }
}
