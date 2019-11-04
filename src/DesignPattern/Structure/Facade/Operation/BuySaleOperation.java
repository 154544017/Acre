package DesignPattern.Structure.Facade.Operation;

import DesignPattern.Structure.FlyweightFactory.GoodsFactory;
import Model.Goods.Product;
import Model.Rancher;
import DesignPattern.Structure.Composite.Stock.Stock;
import Model.Goods.GoodsEnum;
import Util.MyUtils;
/**
 *  使用了外观模式
 *  该类实现了高层接口类，为复杂的购买操作提供了一个简易的接口
 */
public class BuySaleOperation implements SaleOperation {

    /**
     *
     * @param rancher Rancher类, 代表使用该操作的农场主
     * @param thing GoodsEnum枚举类，代表需要操作的对象
     * @param number int类型，代表数量
     * @param args String[]，可变参数，在某些接口有用，在某些接口被掩蔽。在该类中，该变量被掩蔽。
     */
    @Override
    public void peopleOperation(Rancher rancher, GoodsEnum thing, int number,String[] args) {
        MyUtils.getModifierString(this,null,"peopleOperation");
        GoodsFactory goodsFactory = GoodsFactory.getInstance();
        Product product = goodsFactory.getGoods(thing);
        double price = product.price();
        if (price*number > rancher.getMoney()){
            System.out.println(rancher.getUserName()+"当前拥有 ￥"+rancher.getMoney()+",购买这些产品需要￥"+(price*number)
                    +",金钱不够无法购买");
        }else{
            Stock stock = rancher.getStock();
            stock.stockIn(thing,number);
            double nowPrice = rancher.getMoney();
            nowPrice = nowPrice - price*number;
            rancher.setMoney(nowPrice);
            System.out.println("成功购买"+product.getDescription()+number+"个,"+rancher.getUserName()+"现在还拥有金钱 ￥"+nowPrice);
        }
    }
}
