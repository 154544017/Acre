package DesignPattern.Structure.Facade.Operation;

import Model.Rancher;
import Model.Goods.GoodsEnum;

public interface SaleOperation {
    void peopleOperation(Rancher rancher,GoodsEnum thing, int number,String[] args);
}
