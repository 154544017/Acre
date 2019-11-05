package DesignPattern.Behavior.Strategy;

import Model.Plant.Plant;

/**
 * 策略接口，运用了策略模式
 *
 */
public interface Strategy{

    /**
     * 接口函数，可以选定指定植物完成操作
     *
     * @param plant 选定的植物实例
     */
    void strategyInterface(Plant plant);

}
