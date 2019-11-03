package Model;

import Model.Obeserver.Observer;
import Model.State.Growth;
import Model.State.Maturation;
import Model.State.State;
import Model.State.Youth;
import Util.MyUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 动植物基类
 */
public abstract class FarmLife implements Cloneable{

    protected int id;
    protected State state;
    protected int growthTime;

    /** 维护该动物的观察者 */
    private List<Observer> mObservers = new ArrayList<>();

    /**
     * Register the observer object
     *
     * @param observer the observer object to register
     */
    public void attach(Observer observer) {
        MyUtils.getModifierString(this,getSelf(),"attach:");
        mObservers.add(observer);
        System.out.println("观察者成功绑定" + this.getSelf());
    }

    /**
     * Detach the observer object
     *
     * @param observer the observer object to detach
     */
    public void detach(Observer observer) {
        MyUtils.getModifierString(this,getSelf(),"detach:");
        mObservers.remove(observer);
        System.out.println("观察者解除绑定" + this.getSelf() );
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
        MyUtils.getModifierString(this,getSelf(),"grow");
        if(state.getClass() == Youth.class){
            this.setState(new Growth());
        }else if(state.getClass() == Growth.class){
            this.setState(new Maturation());
            System.out.println(this.getSelf() + "已经可以收获了!");
        }else {
            System.out.println(this.getSelf() + "已经可以收获了!");
        }
    }

    public abstract boolean isNull();
    public void show(){
        MyUtils.getModifierString(this,getSelf(),"show:");
        System.out.println(getSelf() + state.toString());
    }

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
