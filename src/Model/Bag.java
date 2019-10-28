package Model;

import java.util.List;

public class Bag  {
    private String name;
    private List<Bag> subBag;

    private List content;

    public void addSubBag(Bag p){
        subBag.add(p);
    }
    public void addContent(Bag p){
        content.add(p);
    }

    public void removeSubBag(Bag p) {
        subBag.remove(p);
    }

    public void removeContnet(Object o) {
        content.remove(o);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Bag> getSubBag() {
        return subBag;
    }

    public List<Bag> getContent() {
        return content;
    }

    public Bag getOneSubBag(String n){
        for(Bag p:subBag){
            if(p.name.equals(n)){
                return p;
            }
        }
        return null;
    }
    public Object getOneContent(String n){
        for(Object c:content){
            if(c.toString().equals(n)){
                return c;
            }
        }
        return null;
    }

    public String toString(){
        return name;
    }
}
