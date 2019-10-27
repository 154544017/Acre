package Model;

import java.util.List;

public class Bag  {
    private String name;
    private List<Bag> subBag;

    public void addSubBag(Bag p){
        subBag.add(p);
    }

    public void remove(Bag p) {
        subBag.remove(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubBag(List<Bag> subBag) {
        this.subBag = subBag;
    }

    public List<Bag> getSubBag() {
        return subBag;
    }

    public Bag getOneSubBag(String n){
        for(Bag p:subBag){
            if(p.name.equals(n)){
                return p;
            }
        }
        return null;
    }

    public String toString(){
        return name;
    }
}
