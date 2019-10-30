package Model.Animal;


import Model.State.State;

public abstract class Chicken extends Animal {

    public Chicken(int growthTime, int feedAmount) {
        super(  growthTime, feedAmount);
    }
}
