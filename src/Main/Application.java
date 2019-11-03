package Main;

import Model.Rancher;
import Test.GameTest;
import Util.MyUtils;

public class Application {
    private static Application ourInstance = new Application();

    public static Application getInstance() {
        return ourInstance;
    }

    private Application() {

    }


    public void run() {
        System.out.println(MyUtils.getInfo("欢迎来到一亩三分地(默认为农场主wxn)"));
        System.out.println(MyUtils.getInfo("进入农场"));
        Rancher rancher = new Rancher("wxn");
        GameTest test = new GameTest(rancher);
        test.PlantFarmTest();
        System.out.println(MyUtils.getInfo("农场测试完毕"));
        System.out.println(MyUtils.getInfo("进入牧场"));
        test.AnimalFarmTest();
    }

}
