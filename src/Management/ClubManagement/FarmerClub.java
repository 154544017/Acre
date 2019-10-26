package Management.ClubManagement;

import Model.Rancher;

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
                member.receive(sender ,message);
            }
        }
    }

    @Override
    public void noticeSomeone(Member sender, Member receiver, String message) {
        for(Member member :memberList){
            if(member.equals(receiver)){
                receiver.receive(sender,message);
            }
        }
    }

    @Override
    public void sendGiftToAll(Member rancher, Object gift) {

    }

    @Override
    public void sendGiftToSomeone(Member sender, Member receiver, Object gift) {

    }
}