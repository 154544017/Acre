package Model;

import Management.ClubManagement.Member;
import Management.FarmlandManagement.FarmlandSet;
import Model.Plant.Plant;
import Model.Stock.Stock;

public class Rancher extends Member {
    private double money;
    private Stock stock;
    public Rancher(String name){
        this.userName =name;
        money = 1000;
        stock = Stock.getInstance();
    }

    public void plant(FarmlandSet farmlandSet, Plant plant){
        farmlandSet.plant(plant);
    }

    public void harvest(FarmlandSet farmlandSet){
        farmlandSet.reapAllFarmland();
    }

    public void setMoney(double money){
        this.money = money;
    }

    public double getMoney(){
        return money;
    }

    public Stock getStock(){
        return stock;
    }
}