package Model.Fodder;

/**
 * 目的地B1
 */
public class MediumFodder implements Fodder {

    @Override
    public void feed() {
        System.out.println("be fed by MediumFodder");
    }

    @Override
    public int getNum() {
        return 1;
    }
}

