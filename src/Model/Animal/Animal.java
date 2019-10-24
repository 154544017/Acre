package Model.Animal;

import Model.FarmLife;
import Model.State.State;

public abstract class Animal extends FarmLife {
    private int feedAmount;//每阶段需要吃的饲料数量

    public Animal(String name, int growthTime, int feedAmount) {
        super(name, growthTime);
        this.feedAmount = feedAmount;
    }

    public abstract void eat();
}
