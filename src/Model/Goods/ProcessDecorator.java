package Model.Goods;

public abstract class ProcessDecorator extends Product {
    protected double rate ;
    public abstract String getDescription();

    @Override
    public String toString() {
        return getDescription();
    }
}
