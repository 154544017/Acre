package Model.Animal;

import Model.State.State;

//母鸡
public class Hen extends Chicken {
    private static String name = "Hen";
    private static int count = 0;
    public Hen() {
        super(10,10);
    }

    @Override
    public String getSelf() {
        return null;
    }

    @Override
    public void eat() {
        System.out.println(name + getId() + "正在吃东西");
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void show() {
        System.out.println("我是" + name + getId());
    }


    @Override
    public void setId() {
        this.id = count++;
    }
}
