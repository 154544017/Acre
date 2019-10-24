package Creation.Builder;

public class PlantFarmSceneDirector extends AbstractSceneDirector {
    public PlantFarmSceneDirector(AbstractSceneBuilder builder) {
        super(builder);
    }

    @Override
    void builderOthers() {
        ((PlantFarmSceneBuilder)builder).buildLands();
        ((PlantFarmSceneBuilder)builder).buildDog();
    }
}
