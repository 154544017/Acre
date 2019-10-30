package Behavior.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void execCommand(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }
}
