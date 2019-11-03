package DesignPattern.Behavior.Medium.ClubManagement;

import DesignPattern.Structure.Composite.Stock.Stock;
import Model.Goods.GoodsEnum;
import Util.MyUtils;

/**
 * 使用了中介者模式
 * 成员的抽象类，包含成员的基本信息、收发消息、收发礼物的方法
 */
public abstract class Member {
    protected FarmerClub myClub;
    protected String userName;
    public Member(){}

    public  abstract void sendGiftToAll(GoodsEnum goods,Integer num);
    public abstract void sendGiftToSomeone(Member receiver,GoodsEnum goods,Integer num);

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setClub(FarmerClub club){
        myClub = club;
    }

    public String getUserName() {
        return userName;
    }

    /**
     * 给俱乐部所有成员发送消息
     * @param message 消息内容
     */
    public  void sendMessageToAll(String message){
        MyUtils.getModifierString(this,null,"sendMessageToAll");
        System.out.println(userName + "给所有成员发送消息："+message);
        myClub.noticeAll(this,message);
    }

    /**
     * 给俱乐部的某个成员发送消息
     * @param receiver 成员
     * @param message 消息内容
     */
    public  void sendMessageToSomeone(Member receiver,String message){
        MyUtils.getModifierString(this,null,"sendMessageToSomeone");
        System.out.println(userName + "给"+receiver.getUserName()+"发送消息"+message);
        myClub.noticeSomeone(this,receiver,message);
    }

    /**
     * 接收来自某个成员的消息
     * @param sender 发送消息的成员
     * @param object 接收的消息内容
     */
    public  void receiveMessage(Member sender,Object object){
        if(object instanceof String){
            MyUtils.getModifierString(this,null,"receiveMessage");
            System.out.println(userName + "收到一条来自"+sender.getUserName()+"的消息："+object);
        }else{
            MyUtils.getModifierString(this,null,"receiveMessage");
            System.out.println(userName + "接收到未知类型的消息："+object);
            //礼物可以使各种作物或畜生
        }
    }

    /**
     * 接收来自某个成员的礼物
     * @param sender 发送礼物的成员
     * @param goods 礼物
     * @param num 礼物数量
     */
    public  void receiveGift(Member sender,GoodsEnum goods,Integer num){
        MyUtils.getModifierString(this,null,"receiveGift");
        System.out.println(userName + "收到"+sender.getUserName()+"的礼物："+goods +"*"+num.toString());
        Stock.getInstance().stockIn(goods,num);
    }
}