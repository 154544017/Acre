package Behavior.ChainOfResponsibility;

import Model.Farmland;

public class CattleHandler extends Handler {
    public CattleHandler(){
        this.responsibility = MIXED;
        setNextHandler(new TractorHandler());
    }

    @Override
    protected void handle(Farmland farmland) {
        System.out.println("CattleHandler:Handler:土地" + farmland.landId + "为混合土地，已由耕牛开垦！");
    }
}