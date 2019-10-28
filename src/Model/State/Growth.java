package Model.State;

public class Growth implements State{
    @Override
    public void react() {
        System.out.println("Growth");
    }

    @Override
    public int getNum() {
        return 2;
    }
}
