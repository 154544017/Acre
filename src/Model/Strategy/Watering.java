package Model.Strategy;

import Model.Plant.Plant;

public class Watering implements Strategy {

    @Override
    public void strategyInterface(Plant plant) {
//        System.out.println("Strategy land #" + farmLandNo + " is being watered.");
        plant.show();
        if (plant.isNull()) {
            return;
        }
        System.out.println(plant.getSelf() + " is being watered.");
        plant.grow();
    }

}
