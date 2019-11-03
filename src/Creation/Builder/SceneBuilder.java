package Creation.Builder;


import Management.FarmlandManagement.FarmlandSet;
import Model.Farmland;
import Model.Rancher;
import Model.Scene.AnimalFarmScene;
import Model.Scene.PlantFarmScene;
import Model.Scene.Scene;
import Util.MyUtils;

/**
 * 使用了建造者模式,模版方法模式
 * 将场景创建分为背景加载、装饰加载、其他加载，来分步完成场景的创建。
 */
public abstract class SceneBuilder {
    private String name;
    public Rancher rancher;

    /**
     * 构造方法
     * @param name 要创建的场景名(PlantFarm/AnimalFarm)
     * @param rancher 进入场景的玩家实例
     */
    public SceneBuilder(String name,Rancher rancher){
        this.rancher = rancher;
        this.name = name;
    }

    /**
     * 封装builder模式，调用各部分的创建方法，完成场景的创建
     * @return 创建好的场景
     */
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

    /**
     * 农场则加载土地，牧场则加载窝棚
     * @return SceneBuilder以便进行链式创建
     */
    public abstract SceneBuilder buildOthers();

    /**
     * 通过SceneBuilder自己来创建场景
     * @return 创建好的场景实例
     */
    public Scene build(){
        return name.equals("AnimalFarm") ? new AnimalFarmScene(this) : new PlantFarmScene(this);
    }
}
