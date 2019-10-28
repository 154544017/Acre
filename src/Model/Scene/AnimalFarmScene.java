package Model.Scene;

import Model.Rancher;

public class AnimalFarmScene extends Scene {
    private Rancher rancher;
    public AnimalFarmScene(){
        System.out.println("牧场加载成功");
    }

    @Override
    public void setRancher(Rancher rancher) {
        this.rancher = rancher;
    }
}
