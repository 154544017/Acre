package Model.State;

public class Youth implements State {
    @Override
    public void react() {
        System.out.println("Youth");
    }

    @Override
    public int getNum() {
        return 1;
    }
}
