package Model.Animal;

import Model.State.State;

public abstract class Cattle extends Animal{

    public Cattle(int growthTime, int feedAmount) {
        super( growthTime, feedAmount);
    }
}
