package Model.Animal;

import Model.State.State;

public abstract class Cattle extends Animal{

    public Cattle(String name,  int growthTime, int feedAmount) {
        super(name,  growthTime, feedAmount);
    }
}
