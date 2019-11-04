package DesignPattern.Structure.Facade.Operation;

import Model.Rancher;
import Model.Goods.GoodsEnum;

/**
 *  使用了外观模式
 *  该类即为定义的高层接口类
 */
public interface SaleOperation {
    /**
     *
     * @param rancher Rancher类, 代表使用该操作的农场主
     * @param thing GoodsEnum枚举类，代表需要操作的对象
     * @param number int类型，代表数量
     * @param args String[]，可变参数，在某些接口有用，在某些接口被掩蔽
     */
    void peopleOperation(Rancher rancher,GoodsEnum thing, int number,String[] args);
}
