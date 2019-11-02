package Model.Scene;

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


public class AnimalFarmScene extends Scene {
    private List<Animal> animalList=new ArrayList<>();
    private List<Product> byProductList=new ArrayList<>();


    public AnimalFarmScene(SceneBuilder builder){
        super(builder);
        System.out.println("牧场加载成功");
        System.out.println("玩家" + rancher.getUserName() + "进入牧场!");
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    //缺少副产品信息
    public void showAnimalFarm(){
        if (animalList.isEmpty()){
            System.out.println("牧场空空，赶紧养点小动物把!");
            return;
        }
        for (Animal animal: animalList) {
            animal.show();
        }
        for(Product p: byProductList){
            System.out.println(p.getDescription());
        }
    }

    public void raiseAnimal(Animal animal){
        rancher.raise(this, animal);
        animal.attach(getNotification());
        System.out.println(this.getClass().getSimpleName() + ":raiseAnimal:"+ "成功放养"+animal.getSelf());
    }
    public void harvestByProduct(){
        //放到包裹里还没写
        for (Product product: byProductList) {
            System.out.println(this.getClass().getSimpleName() + ":harvestByProduct: 收获" + product.getDescription());

        }
        byProductList.clear();
    }

    public void harvestAnimal(){
        rancher.harvestAnimal(this);
    }
    public boolean feedAnimal(Animal a, String className) {
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
            } else if (a.getState().getNum() + a.fodder.getNum() >= 3) {
                a.setState(new Maturation());
                byProductList.add(a.getProduct());
            }
            return true;
        } else {
            a.show();
            return false;
        }
    }

}
