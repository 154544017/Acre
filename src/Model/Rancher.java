package Model;

import Management.ClubManagement.Member;
import Management.FarmlandManagement.FarmlandSet;
import Model.Plant.Plant;

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


}