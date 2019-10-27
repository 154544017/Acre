package Behavior.ChainOfResponsibility;

import Model.FarmLife;

public class WateringHandler extends Handler {

    public WateringHandler(){
        this.responsibility = WATERING;
        setNextHandler(new FertilizingHandler());
    }

    @Override
    protected void handle(FarmLife farmLife) {

    }
}
