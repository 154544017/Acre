package DesignPattern.Behavior.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用了命令模式
 * 维护命令列表，进行任务调度
 */
public class CommandInvoker {
    private List<Command> commandList = new ArrayList<>();

    /**
     * 添加命令到命令列表中
     * @param command 待加入命令
     */
    public void addCommand(Command command){
        commandList.add(command);
    }

    /**
     * 根据加入命令列表顺序，执行命令
     * 执行完所有命令后，清空命令列表
     */
    public void execCommand(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }
}
