package DesignPattern.Structure.Bridge.Fodder;

/**
 * 普通饲料，实现桥接接口
 */
public class MediumFodder implements Fodder {

    @Override
    /**
     * 实现桥接接口
     */
    public void feed() {
        System.out.println("被普通饲料喂养");
    }

    @Override
    /**
     * 普通饲料使动物成熟度加2
     */
    public int getNum() {
        return 1;
    }

    public String toString(){
        return "MediumFodder";
    }
}

