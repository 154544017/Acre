package Model.Goods;

public class BoxingDecorator extends ProcessDecorator {
    private Product product;

    public BoxingDecorator(Product product){
        this.product = product;
        this.rate = 10;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + "经过包装后，价格为每斤" + price() + "元";
    }

    @Override
    public double price() {
        return product.price()+rate;
    }
}
