package Behavior.ChainOfResponsibility;

import Model.Farmland;
import Util.MyUtils;

public class CattleHandler extends Handler {
    public CattleHandler(){
        this.responsibility = MIXED;
        setNextHandler(new TractorHandler());
    }

    @Override
    protected void handle(Farmland farmland) {
        MyUtils.getModifierString(this,null,"handle");
        System.out.println(+ farmland.landId + "为混合土地，已由耕牛开垦！");
    }
}