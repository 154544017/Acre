package Model.Plant;


import Model.Scene.PlantFarmScene;

public class ChineseCabbage extends Plant {
    private static String name = "ChineseCabbage";
    private static int count = 0;

    public ChineseCabbage() {
        super(28);
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
    @Override
    public void buryIn(PlantFarmScene plantfarmscene){
        System.out.println("一棵大白菜被种下去了" );
        attach(plantfarmscene.getNotification());
    }

}
