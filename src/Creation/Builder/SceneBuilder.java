package Creation.Builder;


import Model.Scene.AnimalFarmScene;
import Model.Scene.PlantFarmScene;
import Model.Scene.Scene;

public class SceneBuilder {
    private final String name;

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

    public Scene build(){
        return name.equals("AnimalFarm") ? new AnimalFarmScene() : new PlantFarmScene();
    }
}
