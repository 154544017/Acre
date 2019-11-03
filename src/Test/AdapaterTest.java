package Test;
import DesignPattern.Structure.Adapter.HybridCorn;
import Util.MyUtils;
import org.junit.Test;
public class AdapaterTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("适配器模式测试"));
        HybridCorn h=new HybridCorn();
        System.out.println(h.getSelf());

        System.out.println(MyUtils.getInfo("适配器模式测试成功"));
    }

}
