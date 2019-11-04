package DesignPattern.Structure.Decorator;

import Model.Goods.Product;
/**
 *  使用了装饰器模式
 *  该抽象类继承抽象类Product,是对Product类的外在延伸
 */
public abstract class ProcessDecorator extends Product {
    protected double rate ;
    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription();
    }
}
