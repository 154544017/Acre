package Model.Plant;

import Model.State.Youth;

public class Potato extends Plant {
    private static String name = "Potato";
    private static int count = 0;


    public Potato() {
        super(10);
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
