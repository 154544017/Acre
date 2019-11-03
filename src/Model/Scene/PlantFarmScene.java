package Model.Scene;
import DesignPattern.Creation.Builder.PlantFarmSceneBuilder;
import DesignPattern.Creation.Builder.SceneBuilder;
import DesignPattern.Behavior.Iterator.FarmlandManagement.FarmlandSet;
import Model.Plant.Plant;
import DesignPattern.Behavior.Visitor.PlantSettler;
import Model.Goods.GoodsEnum;
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
