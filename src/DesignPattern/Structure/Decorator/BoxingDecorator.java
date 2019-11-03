package DesignPattern.Structure.Decorator;

import Model.Goods.Product;
import Util.MyUtils;

public class BoxingDecorator extends ProcessDecorator {
    private Product product;

    public BoxingDecorator(Product product){
        MyUtils.getModifierString(this,null,"BoxingDecorator");
        this.product = product;
        this.rate = 1;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + "经过包装后，价格为每份" + price() + "元";
    }

    @Override
    public double price() {
        return product.price()+rate;
    }
}
