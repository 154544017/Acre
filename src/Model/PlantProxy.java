package Model;

import Management.FarmlandManagement.FarmlandSet;
import Model.Plant.Plant;

public class PlantProxy {
    public boolean plant(FarmlandSet farmland, Plant plant){
        boolean judge = farmland.plant(plant);
        if(!judge){
            System.out.println("土地已经种满,请收货成熟植物或者去除幼苗后再进行种植");
        }
        return judge;
    }
}
