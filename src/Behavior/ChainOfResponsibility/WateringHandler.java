package Behavior.ChainOfResponsibility;

import Model.Plant.Plant;

public class WateringHandler extends Handler {

    public WateringHandler(){
        this.responsibility = WATERING;
        setNextHandler(new FertilizingHandler());
    }

    @Override
    protected void handle(Plant plant) {
        System.out.println("给" + plant.getSelf()+ "浇水");
        plant.grow();
    }
}
