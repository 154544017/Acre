package DesignPattern.Behavior.ChainOfResponsibility;

import Model.Farmland;

/**
 * 使用了责任链模式
 * 设置开垦请求处理者职责、指定责任链中下一处理者并生成责任链
 */
public abstract class Handler {
    public static int SOFT = 1;
    public static int MIXED = 2;
    public static int HARD = 3;

    protected int responsibility;
    protected Handler nextHandler;

    /**
     * 生成责任链
     * @return 返回责任链首即人力开垦
     */
    public static Handler getChainOfHandler(){
        return new HumanHandler();
    }

    /**
     * 指定责任链中下一处理者
     * @param nextHandler 责任链中下一处理者
     */
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    /**
     * 根据处理者职责选择处理者
     * @param handler 开垦土地类型
     * @param farmland 待开垦土地
     */
    public void selectHandler(int handler, Farmland farmland){
        if(this.responsibility == handler){
            handle(farmland);
        }
        if(nextHandler != null){
            nextHandler.selectHandler(handler, farmland);
        }
    }

    /**
     * 抽象开垦请求处理方法
     * @param farmland 待开垦土地
     */
    abstract protected void handle(Farmland farmland);
}
