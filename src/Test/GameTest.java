package Test;

import static Util.MyUtils.getInfo;
import DesignPattern.Behavior.Interpreter.Instruction;
import DesignPattern.Behavior.Interpreter.Interpreter;
import DesignPattern.Creation.Builder.AnimalFarmSceneBuilder;
import DesignPattern.Creation.Builder.PlantFarmSceneBuilder;
import DesignPattern.Behavior.Medium.ClubManagement.FarmerClub;
import DesignPattern.Behavior.Medium.NPC;
import Model.FarmInfo;
import Model.Rancher;
import Model.Scene.AnimalFarmScene;
import Model.Scene.PlantFarmScene;
import DesignPattern.Behavior.Strategy.ApplyFertilizer;
import DesignPattern.Behavior.Strategy.Context;
import DesignPattern.Behavior.Strategy.Watering;
import DesignPattern.Structure.Facade.Operation.OperationFacade;
import Model.Goods.GoodsEnum;
import DesignPattern.Behavior.Visitor.OptimizationVisitor;
import DesignPattern.Behavior.Memento.FarmInfoManagement.FarmInfoTaker;


/**
 * 游戏整体测试类，被Main里的Application默认调用
 */
public class GameTest {
    private Rancher rancher;

    public GameTest(Rancher rancher) {
        this.rancher = rancher;
    }

    public void PlantFarmTest(){
        //加载玩家信息
        System.out.println(getInfo("加载农场"));
        //进入农场
        PlantFarmScene scene = (PlantFarmScene)new PlantFarmSceneBuilder("PlantFarm", rancher).construct();
        //查看农场信息
        System.out.println(getInfo("查看农场信息"));
        scene.showPlantFarm();
        FarmInfoTaker infoTaker = FarmInfoTaker.getFarmInfoTaker();
        FarmInfo farmInfo = new FarmInfo();
        farmInfo.setName("生态农场");
        farmInfo.setOwnerName("wxn");
        farmInfo.setDescription("我们的生态农场是运用生态学的观点和手段，以“农场”作为农业生态系统的一个整体，并把贯穿于整个系统中的各种生物群体，包括植物、动物、微生物之间，以及生物与非生物环境间的能量转化和物质循环联系起来，对环境—生物系统进行科学合理的组合，以达到获得最大生物产量和维护生态平衡");
        System.out.println("当前农场信息状态：");
        farmInfo.showInfo();
        infoTaker.add(farmInfo.saveInfoToMemento());
        //查看背包
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //买种子
        System.out.println(getInfo("购入种子：玉米、土豆、白菜、杂交玉米种子"));
        System.out.println(getInfo("如果所需钱不够，会提示购买失败"));
        OperationFacade operationFacade = new OperationFacade(rancher);
        operationFacade.buy(GoodsEnum.CORN_SEED,4);
        operationFacade.buy(GoodsEnum.POTATO_SEED, 5);
        operationFacade.buy(GoodsEnum.CABBAGE_SEED,3);
        operationFacade.buy(GoodsEnum.HYBRIDCORN_SEED,2);
        //查看背包
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //种玉米、土豆、大白菜
        System.out.println(getInfo("种植蔬菜：玉米、土豆、白菜、杂交玉米"));
        System.out.println(getInfo("如果所需种子数量不够，会提示种植失败"));
        scene.plant(GoodsEnum.CORN_SEED);
        scene.plant(GoodsEnum.POTATO_SEED);
        scene.plant(GoodsEnum.CABBAGE_SEED);
        scene.plant(GoodsEnum.HYBRIDCORN_SEED);
        scene.showPlantFarm();
        //给玉米浇水，土豆施肥（给成熟的浇水）
        System.out.println(getInfo("给0号土地的植物浇水"));
        Context context = new Context(new Watering());
        context.contextInterface(scene.getPlantByLandId(0));
        context.setStrategy(new ApplyFertilizer());
        System.out.println(getInfo("给0，1号土地的植物施肥"));
        context.contextInterface(scene.getPlantByLandId(1));
        context.contextInterface(scene.getPlantByLandId(0));
        //用优化访问者来访问玉米，土豆，大白菜，来优化种植
        System.out.println(getInfo("通过访问者来优化种植操作"));
        OptimizationVisitor visitor = new OptimizationVisitor();
        scene.getPlantByLandId(0).accept(visitor);
        scene.getPlantByLandId(1).accept(visitor);
        scene.getPlantByLandId(2).accept(visitor);
        //查看现在的种植状况
        System.out.println(getInfo("查看土地种植状况"));
        scene.showPlantFarm();
        //一键收取成熟的作物
        System.out.println(getInfo("一键收取成熟的作物"));
        scene.harvest();
        //查看背包
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //出售玉米
        System.out.println(getInfo("出售玉米"));
        operationFacade.sell(GoodsEnum.CORN,1,new String[]{"0"});
        //查看背包中玉米数量,指令格式为"Select GoodsEnum.toString()"
        Instruction selectCorn = new Instruction("Select Corn");
        Interpreter interpreter = new Interpreter();
        interpreter.interpret(selectCorn);
        //加入俱乐部
        System.out.println(getInfo("加入俱乐部"));
        FarmerClub farmerClub = new FarmerClub("酷炫农场主俱乐部");
        NPC p1 = new NPC("小娜娜");
        NPC p2 = new NPC("小美美");
        NPC p3 = new NPC("小刚刚");
        farmerClub.join(p1);
        farmerClub.join(p2);
        farmerClub.join(p3);
        farmerClub.join(rancher);
        farmerClub.show();
        //给俱乐部成员赠送礼物
        System.out.println(getInfo("赠送礼物"));
        p1.sendGiftToAll(GoodsEnum.CABBAGE,3);
        rancher.sendMessageToSomeone(p1,"谢谢"+p1.getUserName()+"的礼物");
        //给俱乐部成员发送消息
        System.out.println(getInfo("给俱乐部成员发送消息"));
        rancher.sendMessageToAll("我的农场植物生长速度不够高，有什么提升技巧吗？");
        p1.sendMessageToSomeone(rancher,"充钱吧！！");
        p2.sendMessageToSomeone(rancher,"多加肥料！！");


    }

    public void AnimalFarmTest(){
        //加载玩家信息
        System.out.println(getInfo("加载牧场"));
        //进入牧场
        AnimalFarmScene scene = (AnimalFarmScene)new AnimalFarmSceneBuilder("AnimalFarm", rancher).construct();
        //查看背包
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //查看牧场信息
        System.out.println(getInfo("查看牧场信息"));
        scene.showAnimalFarm();
        //购买动物幼崽
        System.out.println(getInfo("购入幼崽：兔子、牛、鸡幼崽"));
        OperationFacade operationFacade = new OperationFacade(rancher);
        operationFacade.buy(GoodsEnum.RABBIT_CUB,3);
        operationFacade.buy(GoodsEnum.CATTLE_CUB, 2);
        operationFacade.buy(GoodsEnum.CHICKEN_CUB,5);
        //查看仓库
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
        //饲养动物
        System.out.println(getInfo("饲养兔子、牛、鸡"));
        scene.raiseAnimal(GoodsEnum.RABBIT_CUB);
        scene.raiseAnimal(GoodsEnum.CATTLE_CUB);
        scene.raiseAnimal(GoodsEnum.CHICKEN_CUB);
        //查看牧场
        System.out.println(getInfo("查看牧场信息"));
        scene.showAnimalFarm();
        //喂养兔子，实现桥接模式
        System.out.println(getInfo("喂养兔子:优质饲料"));
        scene.feedAnimal(0,"ExcellentFodder");
        //喂养鸡，实现桥接模式
        System.out.println(getInfo("喂养鸡:普通饲料"));
        scene.feedAnimal(1,"MediumFodder");
        //查看牧场信息
        System.out.println(getInfo("查看牧场信息"));
        scene.showAnimalFarm();
        //收取副产品
        System.out.println(getInfo("收取副产品"));
        scene.harvestByProduct();
        //一键收取成熟的动物
        System.out.println(getInfo("收取动物"));
        scene.harvestAnimal();
        //查看背包中兔子数量,指令格式为"Select GoodsEnum.toString()"
        Instruction selectRabbit = new Instruction("Select Rabbit");
        Interpreter interpreter = new Interpreter();
        interpreter.interpret(selectRabbit);
        //查看仓库
        System.out.println(getInfo("查看仓库"));
        rancher.showStock();
    }
}
