package Model.State;

public class Maturation implements State {
    @Override
    public void react() {
        System.out.println("Maturation");
    }

    @Override
    public int getNum() {
        return 3;
    }

}
