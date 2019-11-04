package DesignPattern.Behavior.Visitor;

import Model.Plant.ChineseCabbage;
import Model.Plant.Corn;
import Model.Plant.Pasture;
import Model.Plant.Potato;

/**
 * 实现了访问者模式，通过实现接口中的方法，来确定对不同农作物的操作
 */
public interface Visitor {
    void visit(Potato potato);
    void visit(ChineseCabbage chineseCabbage);
    void visit(Corn corn);
    void visit(Pasture pasture);
}
