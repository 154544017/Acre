package Test.DesignPatteernTest.StructureTest;
import DesignPattern.Structure.Adapter.HybridCorn;
import Util.MyUtils;

public class AdapterTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("适配器模式测试"));
        HybridCorn h=new HybridCorn();
        System.out.println(h.growLikePotato());

        System.out.println(MyUtils.getInfo("适配器模式测试成功"));
    }

}
