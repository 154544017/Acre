package DesignPattern.Structure.Decorator;

import Model.Goods.Product;
import Util.MyUtils;

public class WholesaleDecorator extends ProcessDecorator {
    private Product product;
    public WholesaleDecorator(Product product){
        MyUtils.getModifierString(this,null,"WholesaleDecorator");
        this.product = product;
        this.rate = 0.05;
    }


    @Override
    public String getDescription() {
        return product.getDescription()+"     批发价为:每份 "+price()+"元";
    }

    @Override
    public double price() {
        return product.price()*(1-rate);
    }
}
