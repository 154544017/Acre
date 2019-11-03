package Creation.FactoryMethod;

import Model.Plant.Corn;
import Model.Plant.HybridCorn;
import Model.Plant.Plant;

public class HybridCornFactory extends PlantFactory {
    @Override
    public Plant createPlant() {
        HybridCorn corn = (HybridCorn)plantMap.get("HybridCorn").clone();
        corn.setId();
        return corn;
    }
}
