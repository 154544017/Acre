package Creation.FactoryMethod;

import Model.Plant.Plant;
import Model.Plant.Potato;

public class PotatoFactory extends PlantFactory {
    @Override
    public Plant createPlant() {
        Potato potato = (Potato)plantMap.get("Potato").clone();
        potato.setId();
        return potato;
    }
}
