package Model.Fodder;

/**
 * 目的地B1
 */
public class MediumFodder implements Fodder {

    @Override
    public void feed() {
        System.out.println("被普通饲料喂养");
    }

    @Override
    public int getNum() {
        return 1;
    }
}

