package DesignPattern.Structure.Decorator;

import Model.Goods.Product;
import Util.MyUtils;

/**
 *  使用了装饰器模式
 *  该抽象类继承抽象类ProcessDecorator,是Product类的外在延伸的实现
 */
public class WholesaleDecorator extends ProcessDecorator {
    private Product product;

    /**
     *
     * @param product Product类, 可以是Goods类也可以是ProcessDecorator类
     */
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
