package Management.FarmInfoManagement;

import java.util.ArrayList;
import java.util.List;

public class FarmInfoTaker {
    private List<Memento> mementoList;
    public FarmInfoTaker(){
        mementoList = new ArrayList<Memento>();
    }
    public void add(Memento info){
        mementoList.add(info);
    }
    public Memento getLastMemento(){
        return mementoList.get(mementoList.size()-1);
    }
    public Memento backToLastInfo(){
        return mementoList.get(mementoList.size()-1);
    }
}