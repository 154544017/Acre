package Model.Animal;

import Model.FarmLife;
import Model.Fodder.Fodder;
import Model.State.State;

public abstract class Animal extends FarmLife {
    private int feedAmount;//每阶段需要吃的饲料数量

    //引用桥接口
    public Fodder fodder;

    public Animal(int growthTime, int feedAmount) {
        super(growthTime);
        this.feedAmount = feedAmount;
    }

    public abstract void eat();
}
