package Model.Plant;

import Model.Scene.PlantFarmScene;

public class Pasture extends Plant {
    private static String name = "Pasture";
    private static int count = 0;

    public Pasture() {
        super( 20);
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
    /**
     * 访问者模式中访问的方法
     * @param plantfarmscene 要被访问的位置
     */
    public void buryIn(PlantFarmScene plantfarmscene){
        System.out.println("一棵Pature被种下去了" );
        attach(plantfarmscene.getNotification());
    }

}
