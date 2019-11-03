package Management.ClubManagement;

import Model.Rancher;
import Structure.Composite.GoodsEnum;
import Util.MyUtils;

import java.util.ArrayList;
import java.util.List;

public class FarmerClub implements Medium {
    List<Member> memberList;
    public String name;
    public FarmerClub(String name){
        memberList = new ArrayList<Member>();
        this.name = name;
    }
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

    @Override
    public void noticeAll(Member sender, String  message) {
        for(Member member :memberList){
            if(!member.equals(sender)){
                member.receiveMessage(sender ,message);
            }
        }
    }

    @Override
    public void noticeSomeone(Member sender, Member receiver, String message) {
        for(Member member :memberList){
            if(member.equals(receiver)){
                receiver.receiveMessage(sender,message);
            }
        }
    }

    @Override
    public void sendGiftToAll(Member sender, GoodsEnum gift,int num) {
        for(Member member :memberList){
            if(!member.equals(sender)){
                member.receiveGift(sender ,gift,num);
            }
        }
    }

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