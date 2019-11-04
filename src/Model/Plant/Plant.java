package Model.Plant;

import DesignPattern.Behavior.Visitor.Visitor;
import Model.FarmLife;

public abstract class Plant extends FarmLife {

    public Plant(int growthTime) {
        super(growthTime);
    }

    /**
     * 通过接受访问者，来实现对自身的操作
     * @param visitor 实现了对各农作物visit方法的访问者
     */
    public abstract void accept(Visitor visitor);

}
