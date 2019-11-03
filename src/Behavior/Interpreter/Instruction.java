package Behavior.Interpreter;

/**
 * 使用了解释器模式
 * 保存指令语句字符串，并进行分割操作
 */
public class Instruction {
    private int index = -1;
    private String[] tokens;
    private String currentToken;

    /**
     * 构造函数
     * @param text 指令语句字符串
     */
    public Instruction(String text){
        tokens = text.split(" ");
        getNextToken();
    }

    /**
     * 解释器解释完当前关键字后，获取指令中下一关键字
     * @return 下一关键字
     */
    public String getNextToken(){
        if(index < tokens.length - 1){
            currentToken = tokens[++index];
        }else{
            currentToken = null;
        }
        return currentToken;
    }

    /**
     * 解释器获取当前关键字
     * @return 当前关键字
     */
    public String getCurrentToken() {
        return currentToken;
    }
}
