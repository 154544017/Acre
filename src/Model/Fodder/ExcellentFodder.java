package Model.Fodder;

/**
 * 目的地B2
 */
public class ExcellentFodder implements Fodder {

    @Override
    public void feed() {
        System.out.println("be fed by ExcellentFodder");
    }

    @Override
    public int getNum() {
        return 2;
    }

}
