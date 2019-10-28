package Model.Plant;

import Model.FarmLife;
import Model.Fodder.*;

public abstract class Plant extends FarmLife{

    public Plant(String name, int growthTime) {
        super(name, growthTime);
    }

    public abstract void grow();
}
