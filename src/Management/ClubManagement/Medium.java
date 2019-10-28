package Management.ClubManagement;

import Model.Rancher;

public interface Medium {
    boolean join(Member member);
    void noticeAll(Member rancher,String message);
    void noticeSomeone(Member sender,Member receiver,String message);
    void sendGiftToAll(Member rancher,Object gift);
    void sendGiftToSomeone(Member sender,Member receiver,Object gift);
}
