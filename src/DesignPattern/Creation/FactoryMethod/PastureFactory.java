package DesignPattern.Creation.FactoryMethod;

import Model.Plant.Pasture;
import Model.Plant.Plant;

public class PastureFactory extends PlantFactory {
    @Override
    public Plant createPlant(){
        Pasture pasture = (Pasture)plantMap.get("Pasture").clone();
        pasture.setId();
        return pasture;
    }
}
