package DesignPattern.Behavior.Iterator.FarmlandManagement;

import Model.Farmland;

import java.util.Vector;

/**
 * 使用了迭代器模式和代理模式
 * 农地容器的迭代器类
 */
public class FarmlandIteratorAndProxy implements Iterator {
    private Vector<Vector<Farmland>> landMap;
    private int positionX;
    private int positionY;
    public FarmlandIteratorAndProxy(Vector<Vector<Farmland>> landMap){
        this.landMap = landMap;
        positionX = 0;
        positionY = 0;
    }
    /**
     * 判断是否还有下一块
     * @return 有或无
     */
    @Override
    public boolean hasNext() {
        if(positionX + 1== landMap.capacity()){
            if(positionY + 1 == landMap.get(positionX).capacity()){
                return false;
            }
        }
        return true;
    }
    /**
     * 获得迭代器下一个位置指向的农地
     * @return 迭代器下一个位置指向的农地
     */
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
    /**
     * 获得迭代器当前位置的农地
     * @return 迭代器当前位置的农地
     */
    @Override
    public Farmland current() {
        return landMap.get(positionX).get(positionY);
    }
}

