package Model.State;

public class Maturation implements State {
    @Override
    public void react() {
        System.out.println("成熟期!");
    }
}
