package Model.Animal;

public class MaleRabbit extends Rabbit {
    private static int count = 0;

    public MaleRabbit() {
        super("MaleRabbit", 10, 10);
    }

    @Override
    public void eat() {
        System.out.println(getName() + getId() + "正在吃东西");
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void show() {
        System.out.println("我是" + getName() + getId());
    }

    @Override
    public void setId() {
        this.id = count++;
    }
}
