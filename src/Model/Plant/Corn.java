package Model.Plant;

import Model.Scene.PlantFarmScene;

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

    /**
     * 访问者模式中访问的方法
     * @param plantfarmscene 要被访问的位置
     */
    public void buryIn(PlantFarmScene plantfarmscene){
        System.out.println("一棵玉米被种下去了" );
        attach(plantfarmscene.getNotification());
    }

}
