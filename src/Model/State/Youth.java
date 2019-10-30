package Model.State;

public class Youth implements State {
    @Override
    public void react() {
        System.out.println("React Youth");
    }

    @Override
    public int getNum() {
        return 1;
    }

    @Override
    public String toString() {
        return "Youth";
    }
}
