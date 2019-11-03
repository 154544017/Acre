package Behavior.ChainOfResponsibility;

import Model.Farmland;
import Util.MyUtils;

/**
 * 使用了责任链模式
 * 耕牛处理混合型土地开垦，并设置责任链中下一接收者为拖拉机
 */
public class CattleHandler extends Handler {
    /**
     * 构造函数
     */
    public CattleHandler(){
        this.responsibility = MIXED;
        setNextHandler(new TractorHandler());
    }

    /**
     * 耕牛处理混合型土地开垦请求
     * @param farmland 待开垦的土地
     */
    @Override
    protected void handle(Farmland farmland) {
        MyUtils.getModifierString(this,null,"handle");
        System.out.println(farmland.landId + "为混合土地，已由耕牛开垦！");
    }
}