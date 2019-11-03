package DesignPattern.Behavior.Memento.FarmInfoManagement;

/**
 * 使用了备忘录模式
 * 备忘录类，记录了农场的名字、描述、农场主名的信息
 */
public class Memento {
    private String name;
    private  String description;
    private String ownerName;
    public Memento(){

    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

