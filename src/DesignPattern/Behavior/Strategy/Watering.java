package DesignPattern.Behavior.Strategy;

import Model.Plant.Plant;
import Util.MyUtils;

public class Watering implements Strategy {

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
