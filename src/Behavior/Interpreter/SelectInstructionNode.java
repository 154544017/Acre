package Behavior.Interpreter;

import Behavior.Command.Stock;
import Behavior.Command.StockGoods;

public class SelectInstructionNode implements InstructionNode{
    private Stock stock;

    @Override
    public void interpreter(Instruction instruction) {
        if(instruction.getCurrentToken().equalsIgnoreCase("Select")){
            String tag = instruction.getNextToken().toUpperCase();
            int amount = stock.getStock(StockGoods.getStockGoodsByTag(tag));
            if(amount >= 0){
                System.out.println(tag.toUpperCase() + ": " + amount);
            }else{
                System.out.println(tag.toUpperCase() + "不存在！");
            }
        }else{
            System.out.println("输入指令有误！");
        }
    }


}
