package Model.Plant;

import DesignPattern.Behavior.Visitor.Visitor;
import Model.Scene.PlantFarmScene;
import Util.MyUtils;

public class Corn extends Plant {
    private static String name = "Corn";
    private static int count = 0;

    public Corn() {
        super(18);
    }

    @Override
    public String getSelf() {
        return name + id;
    }

    /**
     * 适配器模式中被适配的方法
     * @param name
     * @param id
     * @return String
     */
    public String getSelf(String name,int id) {
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
