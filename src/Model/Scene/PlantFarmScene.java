package Model.Scene;

import Creation.Builder.SceneBuilder;
import Management.FarmlandManagement.FarmlandSet;
import Model.Obeserver.Notification;
import Model.Plant.Plant;

public class PlantFarmScene extends Scene {
    private FarmlandSet farmlandSet;

    public PlantFarmScene(SceneBuilder builder){
        super(builder);
        farmlandSet = builder.set;
        System.out.println("农场加载成功!");
        System.out.println("玩家" + rancher.getUserName() + "进入农场!");
    }

    public void plant(Plant plant){
        rancher.plant(farmlandSet,plant);
        plant.attach(getNotification());
    }


    public void harvest(){
        rancher.harvestPlant(farmlandSet);
    }

    public void showPlantFarm(){
        farmlandSet.showAllFarmland();
    }
}
