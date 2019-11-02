package Management.FarmlandManagement;

import Model.Farmland;
import Model.Plant.Plant;
import Util.MyUtils;

import java.util.Vector;

public class FarmlandSet  implements Container {
    public Vector<Vector<Farmland>> landMap;

    public FarmlandSet(int size ){
        this.landMap =  new Vector<>(size);
        for(int i =0;i<size;i++){
            landMap.add(new Vector<Farmland>(size));
            for(int j = 0;j<size;j++){
                landMap.get(i).add(new Farmland());
            }
        }
    }
    @Override
    public FarmlandIteratorAndProxy getIterator() {
        return new FarmlandIteratorAndProxy(landMap);
    }

    public void reapAllFarmland(){
        FarmlandIteratorAndProxy ite = getIterator();
        ite.current().reapCrop();
        while(ite.hasNext()){
            ite.next().reapCrop();
        }
    }

    public void showAllFarmland(){
        MyUtils.getModifierString(this,null,"showAllFarmland");
        FarmlandIteratorAndProxy ite = getIterator();
        while(true){
            ite.current().show();
            if(ite.hasNext()) {
                ite.next();
            }else{
                break;
            }
        }
    }

    public Plant getPlantByLandId(int id){
        FarmlandIteratorAndProxy ite = getIterator();
        while(true){
            if(ite.current().landId == id){
                return ite.current().crop;
            }
            if(ite.hasNext()) {
                ite.next();
            }else{
                break;
            }
        }
        return null;
    }

    public boolean plant(Plant plant){
        FarmlandIteratorAndProxy ite = getIterator();
        while(!ite.current().plantCrop(plant)){
            if(!ite.hasNext())
                return false;
            else
                ite.next();
        }
        return true;
    }

}
