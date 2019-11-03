package Model.Visitor;

import Model.Plant.Plant;

public interface PlantSettler {
        public void accept(Plant plant);
}
