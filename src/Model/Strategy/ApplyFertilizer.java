package Model.Strategy;

import Model.Plant.Plant;

public class ApplyFertilizer implements Strategy {

    @Override
    public void strategyInterface(Plant plant) {
//        System.out.println("Strategy land #" + farmLandNo + " is being applied fertilizer.");
        plant.show();

        if(plant.isNull()) {
            return;
        }

        System.out.println(plant.getSelf() + "is being applied fertilizer.");

        plant.grow();
    }

}
