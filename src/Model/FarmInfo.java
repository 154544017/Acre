package Model;

import DesignPattern.Behavior.Memento.FarmInfoManagement.Memento;

public class FarmInfo {
    public String name;
    public String description;
    public String ownerName;
    public FarmInfo(){

    }
    public Memento saveInfoToMemento(){
        Memento memento = new Memento();
        memento.setDescription(this.description);
        memento.setName(this.name);
        memento.setOwnerName(this.ownerName);
        return memento;
    }
    public void setInfoFromMemento(Memento memento){
        this.description =memento.getDescription();
        this.name = memento.getName();
        this.ownerName =memento.getOwnerName();
    }
    public void showInfo(){
        System.out.println("农场名："+name+"\n农场主名："+ownerName+"\n简介："+description);
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
