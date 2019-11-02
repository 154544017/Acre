package Model.Goods;

public class WholesaleDecorator extends ProcessDecorator {
    private Product product;
    public WholesaleDecorator(Product product){
        this.product = product;
        this.rate = 0.05;
    }


    @Override
    public String getDescription() {
        return product.getDescription()+"     批发价为:每斤 "+price()+"元";
    }

    @Override
    public double price() {
        return product.price()*(1-rate);
    }
}
