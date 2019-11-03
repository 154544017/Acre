package DesignPattern.Creation.Builder;

import Model.Rancher;
import Util.MyUtils;

public class AnimalFarmSceneBuilder extends SceneBuilder {
    public AnimalFarmSceneBuilder(String name, Rancher rancher) {
        super(name, rancher);
    }

    @Override
    public SceneBuilder buildOthers() {
        MyUtils.getModifierString(this,null,"buildOthers");
        System.out.println("窝棚加载完成");
        return this;
    }
}
