package Model.Strategy;

import Model.Plant.Plant;
import Util.MyUtils;

public class ApplyFertilizer implements Strategy {

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
