package Behavior.ChainOfResponsibility;

import Model.Farmland;
import Util.MyUtils;

public class HumanHandler extends Handler {

    public HumanHandler(){
        this.responsibility = SOFT;
        setNextHandler(new CattleHandler());
    }

    @Override
    protected void handle(Farmland farmland) {
        MyUtils.getModifierString(this,null,"handle");
        System.out.println(farmland.landId + "为柔软土地，已由人力开垦！");
    }
}
