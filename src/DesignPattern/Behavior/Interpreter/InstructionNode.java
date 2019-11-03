package DesignPattern.Behavior.Interpreter;

/**
 * 使用了解释器模式
 * 指令解释节点
 */
public interface InstructionNode {
    void interpreter(Instruction instruction);
}
