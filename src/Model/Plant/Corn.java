package Model.Plant;

import Model.State.Maturation;
import Model.State.State;
import Model.State.Youth;

public class Corn extends Plant {
    private static String name = "Corn";
    private static int count = 0;

    public Corn() {
        super(18);
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
