package DesignPattern.Behavior.Strategy;

import Model.Plant.Plant;

/**
 * 上下文接口类，运用了策略模式<br/>
 *
 * 将选择的策略和选择的植物连接起来，同时也提供了更改策略的接口
 */
public class Context{

    /** 选择的策略，施肥/浇水 */
    private Strategy strategy;

    /**
     * 构造函数
     *
     * @param strategy 策略
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 设定策略
     *
     * @param strategy 策略
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 接口函数，调用具体的操作函数
     *
     * @param plant 待操作的植物实例
     */
    public void contextInterface(Plant plant) {
        strategy.strategyInterface(plant);
    }

}
