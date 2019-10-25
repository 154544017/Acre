package Model.PlantFarm;

public class ForageGrass extends Plant {

    /** the state of the grass */
    private String state = "initial state";

    public String getState() {
        return state;
    }

    public void changeState(String newState) {
        state = newState;
        System.out.println(this.getClass().getName() + " switches its state to " + newState);
        notifyObservers(this, newState);
    }

}
