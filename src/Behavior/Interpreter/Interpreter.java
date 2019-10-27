package Behavior.Interpreter;

public class Interpreter {
    private Instruction instruction;

    public void interpret(){
        if(instruction.getCurrentToken().equalsIgnoreCase("Select")){
            SelectInstructionNode node = new SelectInstructionNode();
            node.interpreter(instruction);
        }else{
            System.out.println("输入指令有误！");
        }
    }
}
