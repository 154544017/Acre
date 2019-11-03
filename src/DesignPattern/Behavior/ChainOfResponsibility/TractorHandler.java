package DesignPattern.Behavior.ChainOfResponsibility;

import Model.Farmland;
import Util.MyUtils;

/**
 * 使用了责任链模式
 * 拖拉机处理坚硬型土地开垦，并设置责任链中下一接收者为空
 */
public class TractorHandler extends Handler {
    /**
     * 构造函数
     */
    public TractorHandler(){
        this.responsibility = HARD;
        setNextHandler(null);
    }

    /**
     * 拖拉机处理坚硬型土地开垦请求
     * @param farmland 待开垦的土地
     */
    @Override
    protected void handle(Farmland farmland) {
        MyUtils.getModifierString(this,null,"handle");
        System.out.println(farmland.landId + "为坚硬土地，已由拖拉机开垦！");
    }
}
