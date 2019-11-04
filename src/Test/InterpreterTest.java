package Test;

import DesignPattern.Behavior.Interpreter.Instruction;
import DesignPattern.Behavior.Interpreter.Interpreter;

public class InterpreterTest {
    public static void main(String[] args){
        Instruction selectPasture = new Instruction("Select Pasture");
        Instruction selectCorn = new Instruction("SELECT Corn");
        Instruction selectRabbit = new Instruction("Select RABBIT");
        Instruction selectChicken = new Instruction("SELECT CHICKEN");
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
