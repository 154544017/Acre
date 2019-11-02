package Model.Plant;



public class ChineseCabbage extends Plant {
    private static String name = "ChineseCabbage";
    private static int count = 0;

    public ChineseCabbage() {
        super(28);
    }

    @Override
    public String getSelf() {
        return name + count;
    }

    @Override
    public boolean isNull() {
        return false;
    }


    @Override
    public void setId() {
        this.id = count++;
    }

    @Override
    public void grow() {
        System.out.println(name+ getId() + "正在生长");
    }
}
