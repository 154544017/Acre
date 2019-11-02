package Model.Animal;

import Model.Goods.Goods;
import Model.Goods.Product;
import Structure.Composite.GoodsEnum;

public class FemaleRabbit extends Rabbit {
    private static String name = "FemaleRabbit";
    private static int count = 0;
    public FemaleRabbit() {
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
    public void show() {
        System.out.println("我是" + getSelf());
    }


    @Override
    public void setId() {
        this.id = count++;
    }
}
