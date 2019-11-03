package DesignPattern.Behavior.Medium.ClubManagement;

import Model.Goods.GoodsEnum;
import Util.MyUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用了中介者模式
 * 农场主俱乐部，包含俱乐部成员列表以及俱乐部成员间传达消息，赠送礼物的方法
 */
public class FarmerClub implements Medium {
    List<Member> memberList;
    public String name;

    /**
     * 构造方法
     * @param name 俱乐部的名字
     */
    public FarmerClub(String name){
        memberList = new ArrayList<Member>();
        this.name = name;
    }

    /**
     * 玩家加入俱乐部
     * @param member 加入俱乐部的玩家实例(Rancher/NPC)
     * @return 是否成功加入俱乐部
     *
     */
    @Override
    public boolean join(Member member) {
        for(Member m :memberList){
            if(m.equals(member)){
                MyUtils.getModifierString(this,null,"join");
                System.out.println(member.getUserName()+"已经是俱乐部成员了！");
               return false;
            }
        }
        memberList.add(member);
        member.setClub(this);
        MyUtils.getModifierString(this,null,"join");
        System.out.println(member.getUserName()+"成功加入"+name+"俱乐部！");
        return true;
    }

    /**
     * 俱乐部给所有成员发送来自某成员的消息
     * @param sender 发送消息的成员
     * @param message 消息内容
     */
    @Override
    public void noticeAll(Member sender, String  message) {
        for(Member member :memberList){
            if(!member.equals(sender)){
                member.receiveMessage(sender ,message);
            }
        }
    }

    /**
     * 俱乐部给某个成员发送来自另一个成员的消息
     * @param sender 发送消息的成员
     * @param receiver 接收消息的成员
     * @param message 消息内容
     */
    @Override
    public void noticeSomeone(Member sender, Member receiver, String message) {
        for(Member member :memberList){
            if(member.equals(receiver)){
                receiver.receiveMessage(sender,message);
            }
        }
    }

    /**
     * 俱乐部给所有成员发送来自某个成员的礼物
     * @param sender 发送礼物的成员
     * @param gift 礼物的实例
     * @param num 给其他每个成员的礼物数量
     */
    @Override
    public void sendGiftToAll(Member sender, GoodsEnum gift,int num) {
        for(Member member :memberList){
            if(!member.equals(sender)){
                member.receiveGift(sender ,gift,num);
            }
        }
    }

    /**
     * 俱乐部给某个成员发送来自另一个成员的礼物
     * @param sender 发送礼物的成员
     * @param receiver 接收礼物的成员
     * @param gift 礼物的实例
     * @param num 礼物数量
     */
    @Override
    public void sendGiftToSomeone(Member sender, Member receiver, GoodsEnum gift,int num) {
        receiver.receiveGift(sender, gift,num);
    }

    public Integer getClubMemberNum(){
        return memberList.size();
    }

    public void show(){
        MyUtils.getModifierString(this,null,"show");
        System.out.println(name+"现已有"+getClubMemberNum().toString()+"位成员"+"他们是：");
        String nameList = "";
        for(Member member :memberList){
            nameList += member.getUserName()+" ";
        }
        System.out.println(nameList);
    }
}