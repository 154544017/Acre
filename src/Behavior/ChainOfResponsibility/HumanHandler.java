package Behavior.ChainOfResponsibility;

import Model.Farmland;
import Util.MyUtils;

/**
 * 使用了责任链模式
 * 人力处理柔软型土地开垦，并设置责任链中下一接收者为耕牛
 */
public class HumanHandler extends Handler {
    /**
     * 构造函数
     */
    public HumanHandler(){
        this.responsibility = SOFT;
        setNextHandler(new CattleHandler());
    }

    /**
     * 人力处理柔软型土地开垦请求
     * @param farmland 待开垦的土地
     */
    @Override
    protected void handle(Farmland farmland) {
        MyUtils.getModifierString(this,null,"handle");
        System.out.println(farmland.landId + "为柔软土地，已由人力开垦！");
    }
}
