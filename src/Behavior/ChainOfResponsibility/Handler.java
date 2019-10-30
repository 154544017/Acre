package Behavior.ChainOfResponsibility;

import Model.FarmLife;
import Model.Plant.Plant;

public abstract class Handler {
    public static int WATERING = 1;
    public static int FERTILIZING = 2;

    protected int responsibility;
    protected Handler nextHandler;

    public static Handler getChainOfHandler(){
        return new WateringHandler();
    }

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void selectHandler(int handler, Plant plant){
        if(this.responsibility == handler){
            handle(plant);
        }else{
            if(nextHandler != null){
                nextHandler.handle(plant);
            }else{
                System.out.println("无效请求！");
            }
        }
    }

    abstract protected void handle(Plant plant);
}
