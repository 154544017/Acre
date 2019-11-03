package Model.Plant;

import Model.Scene.PlantFarmScene;
import Model.State.Youth;

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

    public void buryIn(PlantFarmScene plantfarmscene){
        System.out.println("一个土豆被种下去了" );
        attach(plantfarmscene.getNotification());
    }

}
