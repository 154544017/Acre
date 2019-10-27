package Model.Goods;

public class Egg extends Goods {

    public Egg(String quality) {
        if(quality.equals("low")) {
            price = 1;
            weight = 1;
            System.out.println("创建"+quality+"quality egg");
        } else if(quality.equals("high")) {
            price = 2;
            weight = 2;
            System.out.println("创建"+quality+"quality egg");
        }
    }

}
