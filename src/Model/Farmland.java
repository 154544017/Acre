package Model;

import Model.Plant.Plant;
import Model.State.Maturation;

public class Farmland {
    private static int count = 0;
    public Integer landId;
    public Plant crop;
    public boolean isEmpty;

    public Farmland(){
        this.isEmpty =true;
        this.landId = count++;
    }

    public boolean plantCrop(Plant crop){
        boolean isSuccess = true;
        if(isEmpty) {
            this.crop = crop;
            this.isEmpty = false;
            System.out.println(landId.toString() + "号农地种下作物:"+crop.getSelf());
        }else{
            System.out.println(landId.toString() + "号农地已有作物");
            isSuccess =false;
        }
        return isSuccess;
    }

    public void reapCrop(){
        if(isEmpty)
            return;
        if(crop.getState().getClass().equals(Maturation.class)){
            System.out.println(landId.toString() + "号农地收获作物:"+crop.getSelf());
            this.crop = null;
            this.isEmpty = true;
        }else{
            System.out.println(landId.toString() + "号农地作物"+crop.getSelf()+"尚未成熟");
        }
    }

    public void show(){
        if(isEmpty){
            System.out.println(landId.toString() + "号农地为空地");
        }else{
            System.out.println(landId.toString() + "号有农地作物"+crop.getSelf()+",该作物：");
            crop.show();
        }
    }
}
