package Model.State;

public class Growth implements State{
    @Override
    public void react() {
        System.out.println("生长期!");
    }
}
