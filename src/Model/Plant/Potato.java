package Model.Plant;

import DesignPattern.Behavior.Visitor.Visitor;
import Model.Scene.PlantFarmScene;
import Util.MyUtils;

public class Potato extends Plant {
    private static String name = "Potato";
    private static int count = 0;


    public Potato() {
        super(10);
    }

    @Override
    public String getSelf() {
        return name + id;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void setId() {
        this.id = count++;
    }

    @Override
    public void accept(Visitor visitor) {
        MyUtils.getModifierString(this,getSelf(),"accept");
        System.out.println("接受访问者访问");
        visitor.visit(this);
    }
}
