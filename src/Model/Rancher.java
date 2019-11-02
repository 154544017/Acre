package Model;

import Management.ClubManagement.Member;
import Management.FarmlandManagement.FarmlandSet;
import Model.Animal.Animal;
import Model.Plant.Plant;
import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;

import Model.Scene.AnimalFarmScene;
import Model.State.Maturation;

import java.util.List;


public class Rancher extends Member {
    public  Rancher(String name){
        this.userName =name;
    }

    public void plant(FarmlandSet farmlandSet, Plant plant){
        farmlandSet.plant(plant);
    }

    public void harvestPlant(FarmlandSet farmlandSet){
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
    public  void sendGiftToSomeone(Member receiver,GoodsEnum goods,Integer num) {
        Stock stock = Stock.getInstance();
        if (stock.getStock(goods) >= num) {
            stock.stockOut(goods, num);
            System.out.println(userName + "给" + receiver.getUserName() + "送出礼物：" + goods + "*" + num.toString());
            myClub.sendGiftToSomeone(this, receiver, goods, num);
        } else {
            System.out.println(userName + "想要给" + receiver.getUserName() + "送出礼物：" + goods + "*" + num.toString());
            System.out.println("赠送礼物总数量超过库存，赠送失败！");
        }
    }

    public void harvestAnimal(AnimalFarmScene scene){
        boolean flag = false;
        List<Animal> animalList = scene.getAnimalList();
        for (int i = animalList.size() - 1; i >= 0 ; i--) {
            if(animalList.get(i).getState().getClass() == Maturation.class){
                flag = true;
                System.out.println(this.getClass().getSimpleName() + ":harvestAnimal: 收获动物"+ animalList.get(i).getSelf());
                animalList.remove(i);
            }
        }
        if(!flag){
            System.out.println(this.getClass().getSimpleName() + ":harvestAnimal: 牧场内没有可收获的动物");
        }
    }


    public void raise(AnimalFarmScene scene, Animal animal){
        scene.getAnimalList().add(animal);
    }

}