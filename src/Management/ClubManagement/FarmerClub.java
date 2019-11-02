package Management.ClubManagement;

import Model.Rancher;
import Structure.Composite.GoodsEnum;

import java.util.ArrayList;
import java.util.List;

public class FarmerClub implements Medium {
    List<Member> memberList;
    public FarmerClub(){
        memberList = new ArrayList<Member>();
    }
    @Override
    public boolean join(Member member) {
        memberList.add(member);
        member.setClub(this);
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

    public int getClubMemberNum(){
        return memberList.size();
    }
}