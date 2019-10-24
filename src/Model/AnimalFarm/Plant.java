package AnimalFarm;

import java.util.ArrayList;
import java.util.List;

public class Plant {

    /** Preserve the registered observers */
    private List<Observer> mObservers = new ArrayList<>();

    /**
     * Register the observer object
     * @param observer the observer object to register
     */
    public void attach(Observer observer) {
        mObservers.add(observer);
        System.out.println("Observer " + observer.getClass().getName() + " is attached to "
                                + this.getClass().getName() + " successfully.");
    }

    /**
     * Detach the observer object
     *
     * @param observer the observer object to detach
     */
    public void detach(Observer observer) {
        mObservers.remove(observer);
        System.out.println("Observer " + observer.getClass().getName() + " is detached to"
                                + this.getClass().getName() + " successfully.");
    }

    /**
     * Notify all registered observers
     *
     * @param newState the new state to be notified to all observers
     */
    public void notifyObservers(Plant plant, String newState) {
        for (Observer observer : mObservers) {
            observer.update(this, newState);
        }
    }

}
