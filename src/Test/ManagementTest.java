package Test;

import Creation.FactoryMethod.PlantFactory;
import Creation.FactoryMethod.PotatoFactory;
import Management.ClubManagement.FarmerClub;
import Management.FarmInfoManagement.FarmInfoTaker;
import Management.FarmlandManagement.FarmlandIterator;
import Management.FarmlandManagement.FarmlandSet;
import Model.FarmInfo;
import Model.Farmland;
import Model.Npc;
import Model.Plant.Plant;
import Model.Rancher;
import org.junit.Test;

public class ManagementTest {
    @Test
    public void farmlandIteratorTest(){
        System.out.println("检查农场中农地状态：");
        FarmlandSet farmlandSet = new FarmlandSet(3);
        FarmlandIterator ite = farmlandSet.getIterator();
        PlantFactory factory1 = new PotatoFactory();
        Plant corn1 = factory1.createPlant();
        ite.current().plantCrop(corn1);
       while(true){
           ite.current().show();
           if(ite.hasNext()) {
               ite.next();
           }else{
               break;
           }
        }
    }

    @Test
    public void farmInfoMementoTest(){
        FarmInfoTaker infoTaker = new FarmInfoTaker();
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
        System.out.println("农场信息更新：");
        farmInfo.showInfo();

        farmInfo.setInfoFromMemento(infoTaker.backToLastInfo());
        System.out.println("回退到到上一次设定的农场信息状态：");
        farmInfo.showInfo();
    }

    @Test
    public void clubMediumTest(){
        FarmerClub farmerClub = new FarmerClub();
        Npc p1 = new Npc("小娜");
        Npc p2 = new Npc("小美");
        Npc p3 = new Npc("小刚");
        farmerClub.join(p1);
        farmerClub.join(p2);
        farmerClub.join(p3);

        Rancher me = new Rancher("omf");
        farmerClub.join(me);

        me.sendMessageToAll("我的农场植物生长速度不够高，有什么提升技巧吗？");
        p1.sendMessageToSomeone(me,"充钱吧！！");
        p2.sendMessageToSomeone(me,"多加肥料！！");
        p3.sendMessageToSomeone(me,"商店里买激素！！");
    }
}
