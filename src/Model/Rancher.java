package Model;

import Management.ClubManagement.Member;
import Management.FarmlandManagement.FarmlandSet;
import Model.Plant.Plant;
import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;

public class Rancher extends Member {
    public  Rancher(String name){
        this.userName =name;
    }

    public void plant(FarmlandSet farmlandSet, Plant plant){
        farmlandSet.plant(plant);
    }

    public void harvest(FarmlandSet farmlandSet){
        farmlandSet.reapAllFarmland();
    }

    public  void sendGiftToAll(GoodsEnum goods, Integer num){
        Stock stock = Stock.getInstance();
        if(stock.getStock(goods) >= num*(myClub.getClubMemberNum()-1)){
            stock.stockOut(goods,num*(myClub.getClubMemberNum()-1));
            System.out.println(userName + "给所有俱乐部成员每人送出"+goods +"*"+num.toString());
            myClub.sendGiftToAll(this,goods,num);
        }else{
            System.out.println(userName + "想要给所有俱乐部成员每人送出"+goods +"*"+num.toString());
            System.out.println("赠送礼物总数量超过库存，赠送失败！");
        }
    }
    public  void sendGiftToSomeone(Member receiver,GoodsEnum goods,Integer num){
        Stock stock = Stock.getInstance();
        if(stock.getStock(goods) >= num){
            stock.stockOut(goods,num);
            System.out.println(userName + "给"+receiver.getUserName()+"送出礼物："+goods +"*"+num.toString());
            myClub.sendGiftToSomeone(this,receiver,goods,num);
        }else{
            System.out.println(userName + "想要给"+receiver.getUserName()+"送出礼物："+goods +"*"+num.toString());
            System.out.println("赠送礼物总数量超过库存，赠送失败！");
        }

    }
}