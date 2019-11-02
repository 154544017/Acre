package Operation;

import Creation.FlyweightFactory.GoodsFactory;
import Model.Goods.BoxingDecorator;
import Model.Goods.ProcessDecorator;
import Model.Goods.Product;
import Model.Goods.WholesaleDecorator;
import Model.Rancher;
import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;
import Util.MyUtils;

import java.util.*;

public class SellSaleOperation implements SaleOperation {

    /**
     *
     * @param rancher
     * @param thing
     * @param number
     * @param args
     */
    @Override
    public void peopleOperation(Rancher rancher, GoodsEnum thing, int number,String[] args) {
        MyUtils.getModifierString(this,null,"peopleOperation");
        GoodsFactory goodsFactory = GoodsFactory.getInstance();
        Product product = goodsFactory.getGoods(thing);
        ProcessDecorator processDecorator = null;
        Stock stock = rancher.getStock();
        int num = stock.getStock(thing);
        if(num < number){
            System.out.println(rancher.getUserName()+"拥有"+thing.toString()+"的个数不足,不能够完成出售");
            return;
        }

        HashSet<Integer> set = new HashSet<Integer>();
        if (args != null && args.length != 0){
            for(String arg:args){
                if(arg.equals("0")){
                    set.add(0);
                }else if(arg.equals("1")){
                    set.add(1);
                }
            }
            List<Integer> method = new ArrayList<>();
            for(Integer value:set){
                method.add(value);
            }
            Collections.sort(method);
            for(Integer value:method){
                if(value == 0){
                    processDecorator = new BoxingDecorator(product);
                }
                if(value == 1){
                    if(processDecorator != null){
                        processDecorator = new WholesaleDecorator(processDecorator);
                    }else{
                        processDecorator = new WholesaleDecorator(product);
                    }
                }
            }
        }
        double price;
        if(processDecorator != null){
            price = processDecorator.price();
            System.out.println(processDecorator);
        }else{
            price = product.price();
            System.out.println(product);
        }

        System.out.println("以上述价格出售物品"+number+"个");
        stock.stockOut(thing,number);
        rancher.setMoney(rancher.getMoney()+price*number);
    }
}
