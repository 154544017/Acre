package Model.Scene;

import Behavior.Command.StockOut;
import Creation.Builder.SceneBuilder;
import Model.Animal.Animal;
import Model.Fodder.ExcellentFodder;
import Model.Fodder.*;
import Model.Goods.Goods;
import Model.Goods.Product;
import Model.State.Growth;
import Model.State.Maturation;
import Model.State.State;
import Model.State.Youth;

import java.util.ArrayList;
import java.util.List;
import Model.Rancher;
import Structure.Composite.GoodsEnum;
import Util.MyUtils;


public class AnimalFarmScene extends Scene {
    private List<Animal> animalList=new ArrayList<>();
    private List<Product> byProductList=new ArrayList<>();


    public AnimalFarmScene(SceneBuilder builder){
        super(builder);
        MyUtils.getModifierString(this,null,"AnimalFarmScene");
        System.out.println("牧场加载成功");
        System.out.println("玩家" + rancher.getUserName() + "进入牧场!");
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    //缺少副产品信息
    public void showAnimalFarm(){
        MyUtils.getModifierString(this,null,"showAnimalFarm");
        if(byProductList.isEmpty()){
            System.out.println("暂时还没有副产品哦");
        }
        if (animalList.isEmpty()){
            System.out.println("牧场空空，赶紧养点小动物吧");
            return;
        }
        for (Animal animal: animalList) {
            animal.show();
            System.out.println("位于" + animalList.indexOf(animal) + "号窝棚");
        }
        for(Product p: byProductList){
            System.out.println(p.getDescription());
        }
    }

    public void raiseAnimal(GoodsEnum goodsEnum){
        Animal animal = rancher.raise(goodsEnum);
        animal.attach(getNotification());
        animalList.add(animal);
    }

    public void harvestByProduct(){
        rancher.harvestByProduct(this);
    }

    public List<Product> getByProductList() {
        return byProductList;
    }

    public void harvestAnimal(){
        rancher.harvestAnimal(this);
    }
    public boolean feedAnimal(int index, String className) {
        Animal a = animalList.get(index);
        if (!a.isNull()) {
            a.show();

            if (className.equals("MediumFodder")) {
                a.fodder = new MediumFodder();
            } else {
                a.fodder = new ExcellentFodder();
            }
            a.fodder.feed();
            if (a.getState().getNum() + a.fodder.getNum() == 1) {
                a.setState(new Youth());
            } else if (a.getState().getNum() + a.fodder.getNum() == 2) {
                a.setState(new Growth());
            }
            else if(a.getState().getNum()==3){
                System.out.println(a.getSelf()+"已经成熟了");
            }
            else if (a.getState().getNum() + a.fodder.getNum() >= 3) {
                a.setState(new Maturation());
                System.out.println(a.getSelf()+"已经成熟了");
                byProductList.add(a.getProduct());
            }
            return true;
        } else {
            a.show();
            return false;
        }
    }

}
