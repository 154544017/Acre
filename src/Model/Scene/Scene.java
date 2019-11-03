package Model.Scene;

import DesignPattern.Creation.Builder.SceneBuilder;
import DesignPattern.Behavior.Obeserver.Notification;
import Model.Rancher;

public abstract class Scene {
    protected Rancher rancher;
    protected Notification notification;

    public Scene(SceneBuilder sceneBuilder){
        this.rancher = sceneBuilder.rancher;
    }

    public Notification getNotification(){
        if (notification == null){
            notification = new Notification();
        }
        return notification;
    }
}
