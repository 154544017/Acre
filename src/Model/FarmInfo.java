package Model;

import DesignPattern.Behavior.Memento.FarmInfoManagement.Memento;
import Util.MyUtils;

public class FarmInfo {
    public String name;
    public String description;
    public String ownerName;
    public FarmInfo(){

    }

    /**
     * 将当前农场信息状态保存为Memento
     * @return 一个备忘录（存档）实例
     */
    public Memento saveInfoToMemento(){
        Memento memento = new Memento();
        memento.setDescription(this.description);
        memento.setName(this.name);
        memento.setOwnerName(this.ownerName);
        return memento;
    }

    /**
     * 根据备忘录信息设置当前的农场信息
     * @param memento 存档实例
     */
    public void setInfoFromMemento(Memento memento){
        MyUtils.getModifierString(this,null,"setInfoFromMemento");
        this.description =memento.getDescription();
        this.name = memento.getName();
        this.ownerName =memento.getOwnerName();
        System.out.println("当前农场信息成功回退到上一个存档的农场信息状态！");
    }
    public void showInfo(){
        System.out.println("农场名："+name+"\n农场主名："+ownerName+"\n简介："+description);
    }

    public void setOwnerName(String ownerName) {
        MyUtils.getModifierString(this,null,"setOwnerName");
        this.ownerName = ownerName;
        System.out.println("农场主名字更新为:"+ownerName);
    }

    public void setName(String name) {
        MyUtils.getModifierString(this,null,"setName");
        this.name = name;
        System.out.println("农场名字更新为:"+name);
    }

    public void setDescription(String description) {
        MyUtils.getModifierString(this,null,"setDescription");
        this.description = description;
        System.out.println("农场描述更新为:"+description);
    }
}
