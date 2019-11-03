package DesignPattern.Creation.FactoryMethod;

import Model.Plant.ChineseCabbage;
import Model.Plant.Plant;

public class ChineseCabbageFactory extends PlantFactory {
    @Override
    public Plant createPlant() {
        ChineseCabbage chineseCabbage = (ChineseCabbage) plantMap.get("ChineseCabbage").clone();
        chineseCabbage.setId();
        return chineseCabbage;
    }
}
