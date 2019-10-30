package Creation.Builder;


import Management.FarmlandManagement.FarmlandSet;
import Model.Farmland;
import Model.Scene.AnimalFarmScene;
import Model.Scene.PlantFarmScene;
import Model.Scene.Scene;

public class SceneBuilder {
    private final String name;
    private FarmlandSet set;


    public SceneBuilder(String name){
        this.name = name;
    }

    public SceneBuilder buildBackground(){
        System.out.println("背景加载成功");
        return this;
    }

    public SceneBuilder buildDecoration(){
        System.out.println("装饰加载成功");
        return this;
    }

    public SceneBuilder buildOthers(){
        if (name.equals("PlantFarm")){
            set = new FarmlandSet(20);
            System.out.println("土地加载完成");
        }else {
            System.out.println("窝棚加载成功");
        }
        return this;
    }

    public Scene build(){
        return name.equals("AnimalFarm") ? new AnimalFarmScene() : new PlantFarmScene(set);
    }
}
