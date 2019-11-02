package Model.Scene;

import Creation.Builder.SceneBuilder;
import Management.FarmlandManagement.FarmlandSet;
import Model.Obeserver.Notification;
import Model.Plant.Plant;
import Structure.Composite.GoodsEnum;
import Util.MyUtils;

public class PlantFarmScene extends Scene {
    private FarmlandSet farmlandSet;

    public PlantFarmScene(SceneBuilder builder){
        super(builder);
        farmlandSet = builder.set;
        MyUtils.getModifierString(this,null,"AnimalFarmScene");
        System.out.println("农场加载成功!");
        System.out.println("玩家" + rancher.getUserName() + "进入农场!");
    }

    public void plant(GoodsEnum goodsEnum){
        Plant plant = rancher.plant(farmlandSet,goodsEnum);
        if(plant != null) {
            plant.attach(getNotification());
        }
    }

    public Plant getPlantByLandId(int id){
        return farmlandSet.getPlantByLandId(id);
    }

    public void harvest(){
        rancher.harvestPlant(farmlandSet);
    }

    public void showPlantFarm(){
        farmlandSet.showAllFarmland();
    }
}
