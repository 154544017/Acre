package Model.Plant;

import Model.State.State;
import Model.State.Youth;

public class Pasture extends Plant {
    private static String name = "Pasture";
    private static int count = 0;

    public Pasture() {
        super( 20);
    }

    @Override
    public String getSelf() {
        return name + id;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void setId() {
        this.id = count++;
    }

}
