package Model.Visitor;

import Model.Plant.Plant;

public interface SettlePlant {
    public void accept(Plant plant);
}