package Test;

import Behavior.ChainOfResponsibility.Handler;
import Behavior.Command.CommandInvoker;
import Model.Farmland;
import Structure.Composite.GoodsEnum;
import Behavior.Command.StockIn;
import Behavior.Command.StockOut;
import Behavior.Interpreter.Instruction;
import Behavior.Interpreter.Interpreter;
import org.junit.Test;

public class BehaviorTest {
    @Test
    public void ChainOfResponsibilityTest(){
        Handler chainOfHandler = Handler.getChainOfHandler();
        chainOfHandler.selectHandler(Handler.SOFT, new Farmland());
        chainOfHandler.selectHandler(Handler.MIXED, new Farmland());
        chainOfHandler.selectHandler(Handler.HARD, new Farmland());
    }

    @Test
    public void CommandTest(){
        StockIn pastureStockIn = new StockIn(GoodsEnum.PASTURE, 10);
        StockIn cornStockIn = new StockIn(GoodsEnum.CORN, 20);
        StockOut pastureStockOut = new StockOut(GoodsEnum.PASTURE, 4);
        StockOut cornStockOut = new StockOut(GoodsEnum.CORN, 8);

        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommand(pastureStockIn);
        commandInvoker.addCommand(cornStockIn);
        commandInvoker.addCommand(pastureStockOut);
        commandInvoker.addCommand(cornStockOut);
        commandInvoker.execCommand();
    }

    @Test
    public void InterpreterTest(){
        Instruction selectPasture = new Instruction("Select Pasture");
        Instruction selectCorn = new Instruction("Select Corn");
        Instruction selectRabbit = new Instruction("Select Rabbit");
        Instruction selectChicken = new Instruction("Select Chicken");
        Instruction selectEgg = new Instruction("Select Egg");
        Instruction selectMilk = new Instruction("Select Milk");

        Interpreter interpreter = new Interpreter();
        interpreter.interpret(selectPasture);
        interpreter.interpret(selectCorn);
        interpreter.interpret(selectRabbit);
        interpreter.interpret(selectChicken);
        interpreter.interpret(selectEgg);
        interpreter.interpret(selectMilk);

    }
}
