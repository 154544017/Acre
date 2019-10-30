package Model;

import Model.Obeserver.Observer;
import Model.State.Growth;
import Model.State.Maturation;
import Model.State.State;
import Model.State.Youth;

import java.util.ArrayList;
import java.util.List;

public abstract class FarmLife implements Cloneable{

    protected int id;
    protected State state;
    protected int growthTime;

    /** Preserve the registered observers */
    private List<Observer> mObservers = new ArrayList<>();

    /**
     * Register the observer object
     *
     * @param observer the observer object to register
     */
    public void attach(Observer observer) {
        mObservers.add(observer);
        System.out.println("Observer " + observer.getClass().getName() + " is attached to "
                + this.getSelf() + " successfully.");
    }

    /**
     * Detach the observer object
     *
     * @param observer the observer object to detach
     */
    public void detach(Observer observer) {
        mObservers.remove(observer);
        System.out.println("Observer " + observer.getClass().getName() + " is detached to"
                + this.getSelf() + " successfully.");
    }

    /**
     * Notify all registered observers
     *
     * @param newState the new state to be notified to all observers
     */
    public void notifyObservers(String name, String newState) {
        for (Observer observer : mObservers) {
            observer.update(name, newState);
        }
    }

    public void grow(){
        if(state.getClass() == Youth.class){
            this.setState(new Growth());
        }else if(state.getClass() == Growth.class){
            this.setState(new Maturation());
        }else {
            System.out.println(this.getSelf() + "已经可以收获了!");
        }
    }

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
    public FarmLife(int growthTime) {

        this.state = new Youth();
        this.growthTime = growthTime;
    }

    public abstract String getSelf();

    public int getId() {
        return id;
    }


    public State getState() {
        return state;
    }


    public void setState(State state) {
         this.state=state;
         this.state.react();
         notifyObservers(getSelf(), state.toString());
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public abstract void setId();
}
