package Management.ClubManagement;

import Model.Rancher;
import Structure.Composite.GoodsEnum;

public interface Medium {
    boolean join(Member member);
    void noticeAll(Member rancher,String message);
    void noticeSomeone(Member sender,Member receiver,String message);
    void sendGiftToAll(Member sender,GoodsEnum gift,int num);
    void sendGiftToSomeone(Member sender, Member receiver, GoodsEnum gift, int num);
}
