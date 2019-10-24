package Model.Animal;


import Model.State.State;

public abstract class Chicken extends Animal {

    public Chicken(String name,  int growthTime, int feedAmount) {
        super(name,  growthTime, feedAmount);
    }
}
