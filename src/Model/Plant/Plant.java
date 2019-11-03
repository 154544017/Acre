package Model.Plant;

import Model.FarmLife;
import Model.Fodder.*;
import Model.Visitor.SceneVisitor;

public abstract class Plant extends FarmLife implements SceneVisitor {

    public Plant(int growthTime) {
        super(growthTime);
    }

}
