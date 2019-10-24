package Creation.Builder;

public class PlantFarmSceneBuilder implements AbstractPlantFarmSceneBuilder {
    @Override
    public void buildLands() {
        System.out.println("土地加载成功");
    }

    @Override
    public void buildDog() {
        System.out.println("看护狗加载成功");
    }
}
