package Model.Animal;

import Model.FarmLife;
import Model.Fodder.Fodder;
import Model.Goods.Product;
import Model.State.State;

/**
 * 实现桥接模式
 */
public abstract class Animal extends FarmLife {
    /**
     * 桥接模式接口
     */
    private int feedAmount;//每阶段需要吃的饲料数量

    //引用桥接口
    public Fodder fodder;

    public Animal(int growthTime, int feedAmount) {
        super(growthTime);
        this.feedAmount = feedAmount;
    }

    public abstract Product getProduct();

    public abstract void eat();
}
