package Model.Scene;

import Management.FarmlandManagement.FarmlandSet;
import Model.Plant.Plant;
import Model.Rancher;

public class PlantFarmScene extends Scene {
    private FarmlandSet farmlandSet;
    private Rancher rancher;

    public PlantFarmScene(FarmlandSet set){
        farmlandSet = set;
        System.out.println("农场加载成功");
    }

    @Override
    public void setRancher(Rancher rancher) {
        this.rancher = rancher;
    }

    public void plant(Plant plant){
        rancher.plant(farmlandSet,plant);
    }

    public void harvest(){
        rancher.harvest(farmlandSet);
    }
}
