package Model.Plant;

import Model.State.State;
import Model.State.Youth;

public class Corn extends Plant {
    private static int count = 0;

    public Corn() {
        super("Corn",18);
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void show() {

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
