package DesignPattern.Structure.Facade.Operation;

import DesignPattern.Structure.FlyweightFactory.GoodsFactory;
import DesignPattern.Structure.Decorator.BoxingDecorator;
import DesignPattern.Structure.Decorator.ProcessDecorator;
import Model.Goods.Product;
import DesignPattern.Structure.Decorator.WholesaleDecorator;
import Model.Rancher;
import DesignPattern.Structure.Composite.Stock.Stock;
import Model.Goods.GoodsEnum;
import Util.MyUtils;

import java.util.*;

/**
 *  使用了外观模式
 *  该类实现了高层接口类，为复杂的出售操作提供了一个简易的接口
 */
public class SellSaleOperation implements SaleOperation {

    /**
     *
     * @param rancher Rancher类, 代表使用该操作的农场主
     * @param thing GoodsEnum枚举类，代表需要操作的对象
     * @param number int类型，代表数量
     * @param args String[]，可变参数，在某些接口有用，在某些接口被掩蔽。在该类中，该变量被使用。
     *             ["0"] 代表对原产品进行包装(价格会变动)
     *             ["1"] 代表将原产品以批发价出售
     *             ["0","1"],["1","0"],["1","0","-1","2"] 均代表将原产品先包装再以批发价出售。
     *                      仅"0","1"具有实际意义。"-1","2"等会被忽略。
     *             null 或者 [] 会被视为不进行任何处理。
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
