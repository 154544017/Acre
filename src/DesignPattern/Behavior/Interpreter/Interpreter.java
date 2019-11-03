package DesignPattern.Behavior.Interpreter;

import Util.MyUtils;

/**
 * 使用了解释器模式
 * 解释select语句为库存查询操作
 */
public class Interpreter {

    public void interpret(Instruction instruction){
        if(instruction.getCurrentToken().equalsIgnoreCase("Select")){
            SelectInstructionNode node = new SelectInstructionNode();
            node.interpreter(instruction);
        }else{
            MyUtils.getModifierString(this, null, "interpret");
            System.out.println("输入指令有误！");
        }
    }
}
