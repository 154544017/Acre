package Behavior.ChainOfResponsibility;

import Model.FarmLife;

public class FeedingHandler extends Handler{
    public FeedingHandler(){
        this.responsibility = FEEDING;
        setNextHandler(null);
    }

    @Override
    protected void handle(FarmLife farmLife) {

    }
}
