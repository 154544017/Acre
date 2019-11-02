package Model.State;

public class Youth implements State {
    @Override
    public void react() {
        System.out.println(this.getClass().getName() + ":" + "react:" + "状态为幼年期");
    }

    @Override
    public int getNum() {
        return 1;
    }

    @Override
    public String toString() {
        return "状态:幼年期";
    }
}
