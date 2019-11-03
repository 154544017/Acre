package DesignPattern.Behavior.Visitor;

import Model.Plant.Plant;

public interface SettlePlant {
    public void accept(Plant plant);
}