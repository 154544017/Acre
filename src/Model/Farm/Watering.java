package Model.Farm;

public class Watering implements Strategy {

    @Override
    public void strategyInterface(int farmLandNo) {
        System.out.println("Farm land #" + farmLandNo + " is being watered.");
    }

}
