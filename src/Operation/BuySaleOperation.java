package Operation;

import Creation.FlyweightFactory.GoodsFactory;
import Model.Goods.Product;
import Model.Rancher;
import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;
import Util.MyUtils;

public class BuySaleOperation implements SaleOperation {

    /**
     *
     * @param rancher 农场主类
     * @param thing 需要购买的货物,通过GoodsEnum枚举类指定
     * @param number 需要购买的数量
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
