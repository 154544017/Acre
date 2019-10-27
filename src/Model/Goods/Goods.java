package Model.Goods;

public abstract class Goods {
    protected int price;
    protected int weight;
    public Goods() {
    }
    public Goods(int price_ ,int weight_){
        price = price_;
        weight = weight_;
    }
    public void show() {
        System.out.println("价格为"+price+" 重量为"+weight);
    }
    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
