package Model.Plant;

import Model.FarmLife;
import Model.State.State;
import Model.Fertilizer.*;

public abstract class Plant extends FarmLife{
    //引用桥接口
    public Fertilizer fertilizer;

    public Plant(String name, int growthTime) {
        super(name, growthTime);
    }

    public abstract void grow();
}
