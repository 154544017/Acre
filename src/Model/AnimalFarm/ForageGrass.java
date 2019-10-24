package AnimalFarm;

class ForageGrass extends Plant {

    /** the state of the grass */
    private String state = "initial state";

    String getState() {
        return state;
    }

    void changeState(String newState) {
        state = newState;
        System.out.println(this.getClass().getName() + " switches its state to " + newState);
        notifyObservers(this, newState);
    }

}
