package Model.Animal;

import Model.Goods.Product;
import Model.State.State;

//公鸡
public class Rooster extends Chicken {
    private static int count = 0;
    private static String name = "Rooster";
    public Rooster() {
        super(10,10);
    }

    @Override
    public String getSelf() {
        return name + id;
    }

    @Override
    public Product getProduct() {
        return null;
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
    public void show() {
        System.out.println("我是" + getSelf());
    }

    @Override
    public void setId() {
        this.id = count++;
    }
}
