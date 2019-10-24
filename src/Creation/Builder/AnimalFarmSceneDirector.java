package Creation.Builder;

public class AnimalFarmSceneDirector extends AbstractSceneDirector {
    public AnimalFarmSceneDirector(AbstractSceneBuilder builder) {
        super(builder);
    }

    @Override
    void builderOthers() {
        ((AnimalFarmSceneBuilder)builder).buildShack();
        ((AnimalFarmSceneBuilder)builder).buildFeedExtruder();
    }
}
