package Test;
import DesignPattern.Structure.Bridge.Fodder.MediumFodder;
import Model.Animal.Animal;
import Model.Animal.Cow;
import Util.MyUtils;
import org.junit.Test;
public class BridgeTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("桥接模式测试"));
        Animal cow=new Cow();
        cow.fodder=new MediumFodder();
        System.out.println(cow.getSelf()+"吃"+cow.fodder.toString());
        System.out.println(MyUtils.getInfo("桥接模式测试成功"));
    }
}
