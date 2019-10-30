package Model.State;

public class Maturation implements State {
    @Override
    public void react() {
        System.out.println("React Maturation");
    }

    @Override
    public int getNum() {
        return 3;
    }

    @Override
    public String toString() {
        return "Maturation";
    }
}
