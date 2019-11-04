package DesignPattern.NullLife;
import Model.FarmLife;
public class NullLife extends FarmLife {
    public NullLife(){
        super();
    }

    @Override
    public String getSelf() {
        return null;
    }
    /**
     * 空对象模式中体现是否是空对象的方法
     * @return boolean 是否是空对象
     */

    @Override
    public boolean isNull(){return true;}

    @Override
    public void show() {
        System.out.println("这只动物不存在!");
    }
    public void setId(){
        this.id=-1;
    }
}
