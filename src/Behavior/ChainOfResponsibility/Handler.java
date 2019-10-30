package Behavior.ChainOfResponsibility;

import Model.Farmland;

public abstract class Handler {
    public static int SOFT = 1;
    public static int MIXED = 2;
    public static int HARD = 3;

    protected int responsibility;
    protected Handler nextHandler;

    public static Handler getChainOfHandler(){
        return new HumanHandler();
    }

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void selectHandler(int handler, Farmland farmland){
        if(this.responsibility == handler){
            handle(farmland);
        }
        if(nextHandler != null){
            nextHandler.selectHandler(handler, farmland);
        }
    }

    abstract protected void handle(Farmland farmland);
}
