package Model.Animal;

import Model.Goods.Product;
import Model.State.State;

//公牛
public class Ox extends Cattle {
    private static String name = "Ox";
    private static int count = 0;
    public Ox() {
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
    public void setId() {
        this.id = count++;
    }
}
