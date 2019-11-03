package Test;

import DesignPattern.Creation.Builder.AnimalFarmSceneBuilder;
import Model.Rancher;
import Util.MyUtils;

public class TemplatePatternTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getInfo("模版模式测试"));
        System.out.println(MyUtils.getInfo("场景创建中buildOthers方法为抽象方法"));
        System.out.println(MyUtils.getInfo("用在construct方法中，体现模版模式"));
        Rancher rancher = new Rancher("manager");
        new AnimalFarmSceneBuilder("AnimalFarm", rancher).construct();
        System.out.println(MyUtils.getInfo("模版模式测试成功"));
    }
}
