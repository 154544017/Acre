package Model.Plant;



public class ChineseCabbage extends Plant {
    private static String name = "ChineseCabbage";
    private static int count = 0;

    public ChineseCabbage() {
        super(28);
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
