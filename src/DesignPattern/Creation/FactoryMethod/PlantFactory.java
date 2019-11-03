package DesignPattern.Creation.FactoryMethod;

import Model.Plant.*;
import DesignPattern.Structure.Adapter.HybridCorn;

import java.util.HashMap;

public abstract class PlantFactory {
    protected static HashMap<String, Plant> plantMap = new HashMap<String, Plant>(){
        {
            put("ChineseCabbage",new ChineseCabbage());
            put("Pasture", new Pasture());
            put("Corn", new Corn());
            put("Potato", new Potato());
            put("HybridCorn", new HybridCorn());
        }
    };
    public abstract Plant createPlant();

}
