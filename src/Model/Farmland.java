package Model;

import Behavior.ChainOfResponsibility.Handler;
import Model.Plant.Plant;
import Model.State.Maturation;

public class Farmland {
    public static int SOFT = 1;
    public static int MIXED = 2;
    public static int HARD = 3;
    public static int HARDNESSTYPE[] = {SOFT,MIXED,HARD};
    private static int count = 0;
    public Integer landId;
    public Plant crop;
    public boolean isEmpty;
    private int hardness;
    public Farmland(){
        this.isEmpty =true;
        this.landId = count++;
        this.hardness = HARDNESSTYPE[(int)(0+Math.random()*(2-1+1))];
        Handler chainOfHandler = Handler.getChainOfHandler();
        chainOfHandler.selectHandler(hardness,this);
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
