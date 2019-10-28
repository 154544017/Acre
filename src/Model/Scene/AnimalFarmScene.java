package Model.Scene;

import Model.Animal.Animal;
import Model.Fodder.ExcellentFodder;
import Model.Fodder.*;
import Model.State.Growth;
import Model.State.Maturation;
import Model.State.State;
import Model.State.Youth;

import java.util.ArrayList;
import java.util.List;

public class AnimalFarmScene extends Scene {
    public AnimalFarmScene(){
        System.out.println("牧场加载成功");
    }
    private List<Animal> animalList=new ArrayList<>();

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public boolean feedAnimal(int id,String className){
        for(Animal a:animalList){
            if(a.getId()==id){
                if(a.isNull()==false){
                    a.show();
                    Class clz = null;
//                    try {
//                        clz = Class.forName(className);
//                    } catch (ClassNotFoundException e) {
//                        e.printStackTrace();
//                    }
//                    try {
//                        a.fodder= (Fodder) clz.newInstance();
//                    } catch (InstantiationException e) {
//                        e.printStackTrace();
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    }
                    if(className.equals("MediumFodder")){
                        a.fodder=new MediumFodder();
                    }else{
                        a.fodder=new ExcellentFodder();
                    }
                    a.fodder.feed();
                    if(a.getState().getNum()+a.fodder.getNum()==1){
                        a.setState(new Youth());
                    }
                    else if(a.getState().getNum()+a.fodder.getNum()==2){
                        a.setState(new Growth());
                    }
                    else if(a.getState().getNum()+a.fodder.getNum()>=3){
                        a.setState(new Maturation());
                    }
                    a.getState().react();
                    return true;
                }
                else{
                    a.show();
                    return false;
                }
            }
            return false;
        }
        return false;

    }
}
