package DesignPattern.Behavior.Interpreter;

import DesignPattern.Structure.Composite.Stock.Stock;
import Model.Goods.GoodsEnum;
import Util.MyUtils;

/**
 * 使用了解释器模式
 * select语句解释节点
 */
public class SelectInstructionNode implements InstructionNode{
    private Stock stock;

    /**
     * 构造函数
     */
    public SelectInstructionNode(){
        stock = Stock.getInstance();
    }

    /**
     * 解释select语句为库存查询操作
     * @param instruction 待解释指令
     */
    @Override
    public void interpreter(Instruction instruction) {
        if(instruction.getCurrentToken().equalsIgnoreCase("Select")){
            String tag = instruction.getNextToken().toUpperCase();
            int amount = stock.getStock(GoodsEnum.getStockGoodsByTag(tag));
            MyUtils.getModifierString(this, null, "interpreter");
            if(amount >= 0){
                System.out.println(tag.toUpperCase() + "当前库存: " + amount);
            }else{

                System.out.println(tag.toUpperCase() + "不存在！");
            }
        }else{
            MyUtils.getModifierString(this, null, "interpreter");
            System.out.println("输入指令有误！");
        }
    }


}
