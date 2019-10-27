package Behavior.Interpreter;

public class Instruction {
    private int index = -1;
    private String[] tokens;
    private String currentToken;

    public Instruction(String text){
        tokens = text.split("");
        getNextToken();
    }

    public String getNextToken(){
        if(index < tokens.length - 1){
            currentToken = tokens[++index];
        }else{
            currentToken = null;
        }
        return currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }
}
