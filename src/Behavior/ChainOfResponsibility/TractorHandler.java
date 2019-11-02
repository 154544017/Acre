package Behavior.ChainOfResponsibility;

import Model.Farmland;
import Util.MyUtils;

public class TractorHandler extends Handler {
    public TractorHandler(){
        this.responsibility = HARD;
        setNextHandler(null);
    }

    @Override
    protected void handle(Farmland farmland) {
        MyUtils.getModifierString(this,null,"handle");
        System.out.println(farmland.landId + "为坚硬土地，已由拖拉机开垦！");
    }
}
