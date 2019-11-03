package Management.ClubManagement;

import Model.Rancher;
import Structure.Composite.GoodsEnum;

/**
 * 使用了中介者模式
 * 中介者模式的接口类，提供发送消息和礼物的接口
 */
public interface Medium {
    boolean join(Member member);
    void noticeAll(Member rancher,String message);
    void noticeSomeone(Member sender,Member receiver,String message);
    void sendGiftToAll(Member sender,GoodsEnum gift,int num);
    void sendGiftToSomeone(Member sender, Member receiver, GoodsEnum gift, int num);
}
