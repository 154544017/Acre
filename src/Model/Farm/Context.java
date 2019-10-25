package Model.Farm;

public class Context{

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(int farmLandNo) {
        strategy.strategyInterface(farmLandNo);
    }

}
