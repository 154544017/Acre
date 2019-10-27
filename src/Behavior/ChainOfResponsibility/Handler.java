package Behavior.ChainOfResponsibility;

import Model.FarmLife;

public abstract class Handler {
    public static int WATERING = 1;
    public static int FERTILIZING = 2;
    public static int FEEDING = 3;

    protected int responsibility;
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void selectHandler(int handler, FarmLife farmLife){
        if(this.responsibility == handler){
            handle(farmLife);
        }else{
            if(nextHandler != null){
                nextHandler.handle(farmLife);
            }else{
                System.out.println("无效请求！");
            }
        }

    }

    abstract protected void handle(FarmLife farmLife);
}
