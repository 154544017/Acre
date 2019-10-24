package Model.Animal;

import Model.State.State;

public abstract class Rabbit extends Animal{

    public Rabbit(String name, int growthTime, int feedAmount) {
        super(name,  growthTime, feedAmount);
    }
}
