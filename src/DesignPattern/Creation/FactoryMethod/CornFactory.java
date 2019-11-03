package DesignPattern.Creation.FactoryMethod;

import Model.Plant.Corn;
import Model.Plant.Plant;

public class CornFactory extends PlantFactory {
    @Override
    public Plant createPlant() {
        Corn corn = (Corn)plantMap.get("Corn").clone();
        corn.setId();
        return corn;
    }
}
