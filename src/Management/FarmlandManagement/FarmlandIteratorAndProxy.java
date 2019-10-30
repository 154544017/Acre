package Management.FarmlandManagement;

import Model.Farmland;

import java.util.Vector;

public class FarmlandIteratorAndProxy implements Iterator {
    private Vector<Vector<Farmland>> landMap;
    private int positionX;
    private int positionY;
    public FarmlandIteratorAndProxy(Vector<Vector<Farmland>> landMap){
        this.landMap = landMap;
        positionX = 0;
        positionY = 0;
    }
    @Override
    public boolean hasNext() {
        if(positionX + 1== landMap.capacity()){
            if(positionY + 1 == landMap.get(positionX).capacity()){
                return false;
            }
        }
        return true;
    }

    @Override
    public Farmland next() {
        if(hasNext()){
            if(positionY + 1 == landMap.get(positionX).capacity()){
                positionX +=1;
                positionY = 0;

            }else{
                positionY +=1;
            }
            return landMap.get(positionX).get(positionY);
        }
        return null;
    }

    @Override
    public Farmland current() {
        return landMap.get(positionX).get(positionY);
    }
}

