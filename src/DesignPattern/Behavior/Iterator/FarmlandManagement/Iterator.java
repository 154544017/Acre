package DesignPattern.Behavior.Iterator.FarmlandManagement;

import Model.Farmland;

/**
 * 使用了迭代器模式
 * 迭代器接口类，提供当前获得迭代器下一个和当期位置所指向的农地的接口
 */
public interface Iterator {
    /**
     * 判断是否还有下一块
     * @return 有或无
     */
    boolean hasNext();

    /**
     * 获得迭代器下一个位置指向的农地
     * @return 迭代器下一个位置指向的农地
     */
    Farmland next();

    /**
     * 获得迭代器当前位置的农地
     * @return 迭代器当前位置的农地
     */
    Farmland current();

}
