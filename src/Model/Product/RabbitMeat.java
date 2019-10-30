package Model.Product;

public class RabbitMeat extends Product {

    public RabbitMeat(){
        this.description = "兔肉";
    }

    @Override
    public double price() {
        return 30;
    }
}
