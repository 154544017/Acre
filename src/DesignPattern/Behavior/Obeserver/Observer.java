package DesignPattern.Behavior.Obeserver;

/**
 * An interface implementing the observer pattern
 */
public interface Observer {

    /**
     * Once the observable object has changed its state,
     * call this method to notify all the observers
     *
     * @param name The name of the observable object
     * @param newState The new state of the observable object
     */
    void update(String name, String newState);

}
