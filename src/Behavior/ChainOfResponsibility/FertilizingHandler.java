package Behavior.ChainOfResponsibility;

import Model.FarmLife;

public class FertilizingHandler extends Handler {
    public FertilizingHandler(){
        this.responsibility = FERTILIZING;
        setNextHandler(new FeedingHandler());
    }

    @Override
    protected void handle(FarmLife farmLife) {

    }
}