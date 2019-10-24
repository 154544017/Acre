package Model.Plant;

import Model.State.State;
import Model.State.Youth;

public class Pasture extends Plant {
    private static int count = 0;

    public Pasture() {
        super("Pasture", 20);
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void show() {
        System.out.println("我是"+ getName() + getId());
    }

    @Override
    public void setId() {
        this.id = count++;
    }

    @Override
    public void grow() {
        System.out.println(getName() + getId() + "正在生长");
    }
}
