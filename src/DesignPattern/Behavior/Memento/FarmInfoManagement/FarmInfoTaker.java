package DesignPattern.Behavior.Memento.FarmInfoManagement;

import Util.MyUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用了备忘录模式,单例模式
 * 农场信息的管理者类
 */
public class FarmInfoTaker {
    private List<Memento> mementoList;
    private static FarmInfoTaker farmInfoTaker;

    /**
     * 获得农场信息的管理者
     * @return 管理者
     */
    public static FarmInfoTaker getFarmInfoTaker(){
        if(farmInfoTaker==null){
            farmInfoTaker = new FarmInfoTaker();
        }
        return farmInfoTaker;
    }
    private FarmInfoTaker(){
        mementoList = new ArrayList<Memento>();
    }

    /**
     * 将农场信息存档
     * @param info 信息实例
     */
    public void add(Memento info){
        mementoList.add(info);
        MyUtils.getModifierString(this,null,"add");
        System.out.println("当前农场信息存档成功！");
    }


    public Memento getLastMemento(){
        return mementoList.get(mementoList.size()-1);
    }

    /**
     * 获得上一个存档的农场信息
     * @return 农场信息存档
     */
    public Memento backToLastInfo(){
        MyUtils.getModifierString(this,null,"backToLastInfo");
        if(mementoList.size()!=0) {
            Memento memento = mementoList.get(mementoList.size() - 1);
            mementoList.remove(mementoList.size() - 1);
            System.out.println("成功取出上一个存档的农场信息！");
            return memento;
        }else{
            System.out.println("农场信息存档为空！");
            return null;
        }
    }
}