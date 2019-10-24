package Farm;

public class ApplyFertilizer implements Strategy {

    @Override
    public void strategyInterface(int farmLandNo) {
        System.out.println("Farm land #" + farmLandNo + " is being applied fertilizer.");
    }

}
