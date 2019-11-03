package DesignPattern.Structure.Bridge.Fodder;

/**
 * 优质饲料，实现桥接接口
 */
public class ExcellentFodder implements Fodder {

    @Override
    /**
     * 实现桥接接口
     */
    public void feed() {
        System.out.println("被优质饲料喂养");
    }

    @Override
    /**
     * 优质饲料使动物成熟度加2
     */
    public int getNum() {
        return 2;
    }
    public String toString(){
        return "ExcellentFodder";
    }

}
