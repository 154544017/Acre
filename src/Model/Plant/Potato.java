package Model.Plant;

import Model.Scene.PlantFarmScene;

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
    /**
     * 访问者模式中访问的方法
     * @param plantfarmscene 要被访问的位置
     */
    public void buryIn(PlantFarmScene plantfarmscene){
        System.out.println("一个土豆被种下去了" );
        attach(plantfarmscene.getNotification());
    }

}
