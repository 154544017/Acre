package Creation.Builder;


import Management.FarmlandManagement.FarmlandSet;
import Model.Farmland;
import Model.Rancher;
import Model.Scene.AnimalFarmScene;
import Model.Scene.PlantFarmScene;
import Model.Scene.Scene;
import Util.MyUtils;

public class SceneBuilder {
    private String name;
    public FarmlandSet set;
    public Rancher rancher;


    public SceneBuilder(String name,Rancher rancher ){
        this.rancher = rancher;
        this.name = name;
    }

    public Scene construct(){
        buildBackground();
        buildDecoration();
        buildOthers();
        return build();
    }
    public SceneBuilder buildBackground(){
        MyUtils.getModifierString(this,null,"buildBackground");
        System.out.println("背景加载成功");
        return this;
    }

    public SceneBuilder buildDecoration(){
        MyUtils.getModifierString(this,null,"buildDecoration");
        System.out.println("装饰加载成功");
        return this;
    }

    public SceneBuilder buildOthers(){
        MyUtils.getModifierString(this,null,"buildOthers");
        if (name.equals("PlantFarm")){
            set = new FarmlandSet(2);
            System.out.println("土地加载完成");
        }else {
            System.out.println("窝棚加载成功");
        }
        return this;
    }

    public Scene build(){
        return name.equals("AnimalFarm") ? new AnimalFarmScene(this) : new PlantFarmScene(this);
    }
}
