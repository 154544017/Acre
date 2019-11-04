package Test;

import DesignPattern.Behavior.Memento.FarmInfoManagement.FarmInfoTaker;
import Model.FarmInfo;
import Util.MyUtils;

public class MementoTest {
    public static void main(String[] args){
        System.out.println(MyUtils.getInfo("备忘录模式测试"));
        FarmInfoTaker infoTaker = FarmInfoTaker.getFarmInfoTaker();
        FarmInfo farmInfo = new FarmInfo();
        farmInfo.setName("生态农场");
        farmInfo.setOwnerName("omf");
        farmInfo.setDescription("我们的生态农场是运用生态学的观点和手段，以“农场”作为农业生态系统的一个整体，并把贯穿于整个系统中的各种生物群体，包括植物、动物、微生物之间，以及生物与非生物环境间的能量转化和物质循环联系起来，对环境—生物系统进行科学合理的组合，以达到获得最大生物产量和维护生态平衡");

        System.out.println("农场信息状态1：");
        farmInfo.showInfo();

        infoTaker.add(farmInfo.saveInfoToMemento());

        farmInfo.setName("开心农场");
        farmInfo.setDescription("开心农场》是由Five Minutes开发机发行，于2008年开布的一款以种植为主的社交网页游戏，用户可以扮演一个农场的农场主，在自己农场里开垦土地、种植各种蔬菜和水果。");
        farmInfo.setOwnerName("Ly");
        farmInfo.showInfo();

        farmInfo.setInfoFromMemento(infoTaker.backToLastInfo());
        farmInfo.showInfo();
        System.out.println(MyUtils.getInfo("备忘录模式测试成功！"));
    }
}
