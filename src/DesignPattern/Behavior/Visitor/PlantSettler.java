package DesignPattern.Behavior.Visitor;

import Model.Plant.Plant;

public interface PlantSettler {
        public void accept(Plant plant);
}
