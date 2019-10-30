package Behavior.ChainOfResponsibility;

import Model.Farmland;

public class TractorHandler extends Handler {
    public TractorHandler(){
        this.responsibility = HARD;
        setNextHandler(null);
    }

    @Override
    protected void handle(Farmland farmland) {
        System.out.println("TractorHandler:Handler:土地" + farmland.landId + "为坚硬土地，已由拖拉机开垦！");
    }
}
