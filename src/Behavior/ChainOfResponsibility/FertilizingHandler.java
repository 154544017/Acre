package Behavior.ChainOfResponsibility;

import Model.Plant.Plant;

public class FertilizingHandler extends Handler {
    public FertilizingHandler(){
        this.responsibility = FERTILIZING;
        setNextHandler(null);
    }

    @Override
    protected void handle(Plant plant) {
        System.out.println("给" + plant.getName() + plant.getId() + "施肥");
        plant.grow();
    }
}