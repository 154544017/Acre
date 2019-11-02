package Model.State;

public class Maturation implements State {
    @Override
    public void react() {
        System.out.println(this.getClass().getSimpleName() + ":" + "react:" + "状态变为成熟期");
    }

    @Override
    public int getNum() {
        return 3;
    }

    @Override
    public String toString() {
        return "状态:成熟期";
    }
}
