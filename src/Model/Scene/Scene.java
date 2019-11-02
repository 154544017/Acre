package Model.Scene;

import Creation.Builder.SceneBuilder;
import Model.Rancher;

public abstract class Scene {
    protected Rancher rancher;

    public Scene(SceneBuilder sceneBuilder){
        this.rancher = sceneBuilder.rancher;
    }
}
