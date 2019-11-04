package DesignPattern.Behavior.Visitor;

import Model.Plant.ChineseCabbage;
import Model.Plant.Corn;
import Model.Plant.Pasture;
import Model.Plant.Potato;
import Util.MyUtils;

/**
 * 具体的访问者，通过重写对各农作物的visit方法，来实现对各农作物的种植优化
 */
public class OptimizationVisitor implements Visitor {
    public OptimizationVisitor() {
        MyUtils.getModifierString(this,null,"constructor");
        System.out.println("创建优化访问者");
    }

    @Override
    public void visit(Potato potato) {
        MyUtils.getModifierString(this, null, "visitPotato");
        System.out.println("已经为土豆除去虫害");
    }

    @Override
    public void visit(ChineseCabbage chineseCabbage) {
        MyUtils.getModifierString(this, null, "visitChineseCabbage");
        System.out.println("已经为白菜多加水");
    }

    @Override
    public void visit(Corn corn) {
        MyUtils.getModifierString(this, null, "visitCorn");
        System.out.println("已经为玉米处理杂草");
    }

    @Override
    public void visit(Pasture pasture) {
        MyUtils.getModifierString(this, null, "visitPasture");
        System.out.println("已经为牧草多施肥");
    }
}
