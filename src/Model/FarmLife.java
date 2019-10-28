package Model;

import Model.State.State;
import Model.State.Youth;

public abstract class FarmLife implements Cloneable{

    protected int id;
    private String name;//种类名
    private State state;
    private int growthTime;

    public abstract boolean isNull();
    public abstract void show();

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

    public FarmLife(){

    }
    public FarmLife(String name, int growthTime) {
        this.name = name;
        this.state = new Youth();
        this.growthTime = growthTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public abstract void setId();
}
