package Model.State;

public class Growth implements State{
    @Override
    public void react() {
        System.out.println(this.getClass().getName() + ":" + "react:" + "状态变为生长期");
    }

    @Override
    public int getNum() {
        return 2;
    }

    @Override
    public String toString() {
        return "状态:生长期";
    }
}
