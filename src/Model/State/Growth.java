package Model.State;

public class Growth implements State{
    @Override
    public void react() {
        System.out.println("React Growth");
    }

    @Override
    public int getNum() {
        return 2;
    }

    @Override
    public String toString() {
        return "Growth";
    }
}
