package Test.DesignPatteernTest.BehaviorTest;

import DesignPattern.Behavior.Medium.ClubManagement.FarmerClub;
import DesignPattern.Behavior.Medium.NPC;
import Model.Goods.GoodsEnum;
import Model.Rancher;
import Util.MyUtils;

import static Util.MyUtils.getInfo;

public class MediumTest {
    public static void main(String arg[]){
        System.out.println(MyUtils.getInfo("中介者模式测试"));
        FarmerClub farmerClub = new FarmerClub("酷炫农场主俱乐部");
        NPC p1 = new NPC("小娜");
        NPC p2 = new NPC("小美");
        NPC p3 = new NPC("小刚");
        farmerClub.join(p1);
        farmerClub.join(p2);
        farmerClub.join(p3);

        Rancher me = new Rancher("omf");
        farmerClub.join(me);

        System.out.println(getInfo("给俱乐部成员发送消息"));
        me.sendMessageToAll("我的农场植物生长速度不够高，有什么提升技巧吗？");
        p1.sendMessageToSomeone(me,"充钱吧！！");
        p2.sendMessageToSomeone(me,"多加肥料！！");
        p3.sendMessageToSomeone(me,"商店里买激素！！");

        System.out.println(getInfo("赠送礼物"));
        p1.sendGiftToSomeone(me, GoodsEnum.CHICKEN,2);
        p2.sendGiftToAll(GoodsEnum.CHICKEN,5);
        me.sendGiftToAll(GoodsEnum.CHICKEN,1);
        me.sendGiftToSomeone(p3,GoodsEnum.CHICKEN,1);
        me.sendGiftToAll(GoodsEnum.CHICKEN,5);
        me.sendGiftToSomeone(p3,GoodsEnum.BEEF,10);
        System.out.println(MyUtils.getInfo("中介者模式测试成功！"));
    }
}
