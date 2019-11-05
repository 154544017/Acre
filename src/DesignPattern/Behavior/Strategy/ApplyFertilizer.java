package DesignPattern.Behavior.Strategy;

import Model.Plant.Plant;
import Util.MyUtils;

/**
 * 施肥策略，运用了策略模式<br/>
 *
 * 可以为指定的植物进行施肥操作
 */
public class ApplyFertilizer implements Strategy {

    /**
     * 施肥接口，为指定植物进行施肥操作
     *
     * @param plant 选定的植物实例
     */
    @Override
    public void strategyInterface(Plant plant) {
        MyUtils.getModifierString(this, null,"strategyInterface");
        plant.show();

        if(plant.isNull()) {
            return;
        }

        System.out.println("给" + plant.getSelf() + "施肥");

        plant.grow();
    }

}
