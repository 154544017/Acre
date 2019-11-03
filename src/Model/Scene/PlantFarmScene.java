package Model.Scene;
import Creation.Builder.PlantFarmSceneBuilder;
import Creation.Builder.SceneBuilder;
import Management.FarmlandManagement.FarmlandSet;
import Model.Obeserver.Notification;
import Model.Plant.Plant;
import Model.Visitor.PlantSettler;
import Structure.Composite.GoodsEnum;
import Util.MyUtils;

public class PlantFarmScene extends Scene implements PlantSettler {
    private FarmlandSet farmlandSet;

    public PlantFarmScene(SceneBuilder builder){
        super(builder);
        farmlandSet = ((PlantFarmSceneBuilder)builder).set;
        MyUtils.getModifierString(this,null,"AnimalFarmScene");
        System.out.println("农场加载成功!");
        System.out.println("玩家" + rancher.getUserName() + "进入农场!");
    }
    @Override
    public void accept(Plant plant){
        plant.buryIn(this);
    }

    public void plant(GoodsEnum goodsEnum){
        Plant plant = rancher.plant(farmlandSet,goodsEnum);
        if(plant!=null) {
            accept(plant);
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
