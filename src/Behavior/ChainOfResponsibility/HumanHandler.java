package Behavior.ChainOfResponsibility;

import Model.Farmland;

public class HumanHandler extends Handler {

    public HumanHandler(){
        this.responsibility = SOFT;
        setNextHandler(new CattleHandler());
    }

    @Override
    protected void handle(Farmland farmland) {
        System.out.println("HumanHandler:Handler:土地" + farmland.landId + "为柔软土地，已由人力开垦！");
    }
}
