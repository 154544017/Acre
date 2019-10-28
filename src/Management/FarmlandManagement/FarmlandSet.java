package Management.FarmlandManagement;

import Model.Farmland;

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
    public FarmlandIterator getIterator() {
        return new FarmlandIterator(landMap);
    }

    public void reapAllFarmland(){
        FarmlandIterator ite = getIterator();
        while(ite.hasNext()){
            ite.next().reapCrop();
        }
    }

}
