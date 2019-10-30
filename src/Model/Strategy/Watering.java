package Model.Strategy;

public class Watering implements Strategy {

    @Override
    public void strategyInterface(int farmLandNo) {
        System.out.println("Strategy land #" + farmLandNo + " is being watered.");
    }

}
