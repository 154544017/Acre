package Model;

import DesignPattern.Behavior.Obeserver.Observer;
import DesignPattern.Behavior.State.Growth;
import DesignPattern.Behavior.State.Maturation;
import DesignPattern.Behavior.State.State;
import DesignPattern.Behavior.State.Youth;
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

    /**
     * 动植物在浇水/施肥/喂养后可调用本方法，更改动植物的生长状态
     */
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

    /**
     * 判断是否为空生物
     *
     * @return boolean, 如果是，返回 true，反之亦然
     */
    public abstract boolean isNull();

    /**
     * 打印动植物的信息
     */
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

    /**
     * 获取自身信息
     *
     * @return 包含自身信息的字符串
     */
    public abstract String getSelf();

    /**
     * 获取自身的ID
     *
     * @return 自身的id
     */
    public int getId() {
        return id;
    }

    /**
     * 获取自身当前生长状态
     *
     * @return 生长状态
     */
    public State getState() {
        return state;
    }


    /**
     * 设置自身的生长状态
     *
     * @param state 修改后的状态
     */
    public void setState(State state) {
         this.state=state;
         this.state.react();
         notifyObservers(getSelf(), state.toString());
    }

    public int getGrowthTime() {
        return growthTime;
    }

    /**
     * 设置id
     */
    public abstract void setId();
}
