package DesignPattern.Creation.Builder;

import DesignPattern.Behavior.Iterator.FarmlandManagement.FarmlandSet;
import Model.Rancher;
import Util.MyUtils;

public class PlantFarmSceneBuilder extends SceneBuilder {
    public FarmlandSet set;

    public PlantFarmSceneBuilder(String name, Rancher rancher) {
        super(name, rancher);
    }

    @Override
    public SceneBuilder buildOthers() {
        MyUtils.getModifierString(this,null,"buildOthers");
        set = new FarmlandSet(2);
        System.out.println("土地加载完成");
        return this;
    }
}
