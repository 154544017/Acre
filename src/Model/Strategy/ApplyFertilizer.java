package Model.Strategy;

public class ApplyFertilizer implements Strategy {

    @Override
    public void strategyInterface(int farmLandNo) {
        System.out.println("Strategy land #" + farmLandNo + " is being applied fertilizer.");
    }

}
