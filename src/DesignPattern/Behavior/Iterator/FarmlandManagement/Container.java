package DesignPattern.Behavior.Iterator.FarmlandManagement;

/**
 * 使用了迭代器模式
 * 容器接口类，提供了获得该容器迭代器的接口
 */
public interface Container {
    Iterator getIterator();
}
