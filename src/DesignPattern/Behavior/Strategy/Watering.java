package DesignPattern.Behavior.Strategy;

import Model.Plant.Plant;
import Util.MyUtils;

/**
 * 浇水策略，运用了策略模式<br/>
 *
 * 可以为指定的植物进行浇水操作
 */
public class Watering implements Strategy {

    /**
     * 浇水接口，为指定植物进行浇水操作
     *
     * @param plant 选定的植物实例
     */
    @Override
    public void strategyInterface(Plant plant) {
        MyUtils.getModifierString(this, null,"strategyInterface");
        plant.show();
        if (plant.isNull()) {
            return;
        }
        System.out.println("给" + plant.getSelf() + "浇水");
        plant.grow();
    }

}
