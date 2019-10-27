package Creation.Builder;

public abstract class AbstractSceneDirector {
    protected AbstractSceneBuilder builder;

    public AbstractSceneDirector(AbstractSceneBuilder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildBackground();
        builder.buildDecoration();
        builderOthers();
    }

    abstract void builderOthers();

}
