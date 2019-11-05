package DesignPattern.Structure.Adapter;

import Model.Plant.Corn;
import Model.Plant.GrowLikePotato;
import Model.Scene.PlantFarmScene;

/**
 * 使用了适配器模式，Corn是适配者类，HybridCorn是适配器类，ShowLikePotato是目标抽象接口
 */
public class HybridCorn extends Corn implements GrowLikePotato {
    private static String name = "HybridCorn";
    private static int count = 0;

    /**
     * 新建HybridCorn后更新id
     */
    public void setId() {
        this.id = count++;
    }

    public String getSelf() {
        return growLikePotato();
    }

    /**
     * ShowLikePotato是适配器模式中的目标抽象接口
     * 调用父类的getSelf(String,int)
     * @return String
     */
    public String growLikePotato() {
        return "杂交后长得像土豆的"+super.getSelf(name,id) + "";
    }
    public void buryIn(PlantFarmScene plantfarmscene){
        System.out.println("一个杂交玉米被种下去了" );
        attach(plantfarmscene.getNotification());
    }
}
