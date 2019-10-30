package Model.Obeserver;

public class Notification implements Observer {

    /** State of the observer */
    private String observerState;

    /**
     * Update the state of the observer, so as to make it consistent
     * with the target state
     *
     * @param name the plant calling the method
     * @param newState the new state of the target observable object
     */
    @Override
    public void update(String name, String newState) {
        observerState = newState;
        System.out.println(name + " changes its state: " + observerState);
    }

}
