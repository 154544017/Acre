package Creation.Builder;

public class AnimalFarmSceneBuilder implements AbstractAnimalFarmSceneBuilder {
    @Override
    public void buildShack() {
        System.out.println("窝棚加载成功");
    }

    @Override
    public void buildFeedExtruder() {
        System.out.println("饲料机加载成功");
    }
}
