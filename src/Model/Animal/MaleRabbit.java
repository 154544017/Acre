package Model.Animal;

public class MaleRabbit extends Rabbit {
    private static String name = "MaleRabbit";
    private static int count = 0;

    public MaleRabbit() {
        super(10, 10);
    }

    @Override
    public String getSelf() {
        return name + id;
    }

    @Override
    public void eat() {
        System.out.println(getSelf() + "正在吃东西");
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
