package Model.Product;

public abstract class Product {
    protected String description = "Unkonwn";
    public String getDescription(){return description;}
    public abstract double price();
    @Override
    public String toString() {
        return this.description +"的价格为:"+price();
    }
}
