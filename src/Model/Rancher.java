package Model;

import Management.ClubManagement.Member;
import Management.FarmlandManagement.FarmlandSet;
import Model.Animal.Animal;
import Model.Plant.Plant;
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