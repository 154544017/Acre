package Behavior.Interpreter;

import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;

public class SelectInstructionNode implements InstructionNode{
    private Stock stock;

    public SelectInstructionNode(){
        stock = Stock.getInstance();
    }

    @Override
    public void interpreter(Instruction instruction) {
        if(instruction.getCurrentToken().equalsIgnoreCase("Select")){
            String tag = instruction.getNextToken().toUpperCase();
            int amount = stock.getStock(GoodsEnum.getStockGoodsByTag(tag));
            if(amount >= 0){
                System.out.println(tag.toUpperCase() + "当前库存: " + amount);
            }else{
                System.out.println(tag.toUpperCase() + "不存在！");
            }
        }else{
            System.out.println("输入指令有误！");
        }
    }


}
