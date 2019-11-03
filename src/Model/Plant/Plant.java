package Model.Plant;

import Model.FarmLife;
import DesignPattern.Behavior.Visitor.SceneVisitor;

public abstract class Plant extends FarmLife implements SceneVisitor {

    public Plant(int growthTime) {
        super(growthTime);
    }

}
