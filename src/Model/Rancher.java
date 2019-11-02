package Model;

import Creation.AbstractFactory.AnimalFactory;
import Creation.AbstractFactory.FemaleFactory;
import Creation.AbstractFactory.MaleFactory;
import Creation.FactoryMethod.PlantFactoryImpl;
import Management.ClubManagement.Member;
import Management.FarmlandManagement.FarmlandSet;
import Model.Animal.Animal;
import Model.Animal.Cattle;
import Model.Animal.Rabbit;
import Model.Goods.Goods;
import Model.Goods.Product;
import Model.Plant.Plant;
import Model.Scene.AnimalFarmScene;
import Model.State.Maturation;
import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;
import Util.MyUtils;

import java.util.List;
import java.util.Random;


public class Rancher extends Member {
    private double money;
    private Stock stock;
    public Rancher(String name){
        this.userName =name;
        money = 1000;
        stock = Stock.getInstance();
    }

    public Plant plant(FarmlandSet farmlandSet, GoodsEnum goodsEnum){
        if (stock.stockOut(goodsEnum,1)){
            PlantFactoryImpl factory = PlantFactoryImpl.getInstance();
            Plant plant = factory.setPlantFactory(goodsEnum).createPlant();
            farmlandSet.plant(plant);
            return plant;
        }else {
            MyUtils.getModifierString(this,null,"plant");
            System.out.println("种植失败");
            return null;
        }
    }

    public void harvestPlant(FarmlandSet farmlandSet){
        farmlandSet.reapAllFarmland();
    }


    public void setMoney(double money){
        this.money = money;
    }

    public double getMoney() {
        return money;
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
        MyUtils.getModifierString(this,null,"harvestAnimal");
        for (int i = animalList.size() - 1; i >= 0 ; i--) {
            Animal animal = animalList.get(i);
            if(animal.getState().getClass() == Maturation.class){
                flag = true;
                System.out.println("收获动物" + animal.getSelf());
                if(animal instanceof Rabbit){
                    stock.stockIn(GoodsEnum.RABBIT,1);
                }else if(animal instanceof Cattle){
                    stock.stockIn(GoodsEnum.CATTLE,1);
                }else {
                    stock.stockIn(GoodsEnum.CHICKEN,1);
                }
                animalList.remove(i);
            }
        }
        if(!flag){
            System.out.println("牧场内没有可收获的动物");
        }
    }

    public void harvestByProduct(AnimalFarmScene scene){
        MyUtils.getModifierString(this,null,"harvestByProduct");
        for (Product product: scene.getByProductList()) {
            System.out.println("收获" + product.getDescription());
            stock.stockIn(((Goods)product).getGoodsEnum(),1);
        }
        scene.getByProductList().clear();
    }

    public void showStock(){
        stock.showStock();
    }

    public Animal raise(GoodsEnum goodsEnum){
        Random random = new Random();
        if (stock.stockOut(goodsEnum,1)){
            AnimalFactory factory;
            if(random.nextInt(2) % 2 == 0){
                factory = new MaleFactory();
            }else {
                factory = new FemaleFactory();
            }
            Animal animal;
            if(goodsEnum == GoodsEnum.RABBIT_CUB){
                animal = factory.createRabbit();
            }else if(goodsEnum == GoodsEnum.CATTLE_CUB){
                animal = factory.createCattle();
            }else {
                animal = factory.createChicken();
            }
            System.out.println("成功饲养" + animal.getSelf());
            return animal;
        }else {
            MyUtils.getModifierString(this,null,"raise");
            System.out.println("饲养失败");
            return null;
        }
    }

    public Stock getStock(){
        return stock;
    }
}