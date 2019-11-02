package Model.Fodder;

/**
 * 目的地B2
 */
public class ExcellentFodder implements Fodder {

    @Override
    public void feed() {
        System.out.println("被优质饲料喂养");
    }

    @Override
    public int getNum() {
        return 2;
    }

}
