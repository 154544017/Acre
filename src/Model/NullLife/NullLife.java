package Model.NullLife;
import Model.FarmLife;
public class NullLife extends FarmLife {
    public NullLife(){
        super();
    }

    @Override
    public String getSelf() {
        return null;
    }


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
