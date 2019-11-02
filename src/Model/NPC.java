package Model;

import Management.ClubManagement.Member;
import Structure.Composite.GoodsEnum;

public class NPC extends Member {
    public NPC(String name){
        this.userName =name;
    }

    @Override
    public void receiveGift(Member sender, GoodsEnum goods, Integer num) {
        System.out.println(userName + "收到"+sender.getUserName()+"的礼物："+goods +"*"+num.toString());
    }
    public  void sendGiftToAll(GoodsEnum goods,Integer num){
        System.out.println(userName + "给所有俱乐部成员每人送出"+goods +"*"+num.toString());
        myClub.sendGiftToAll(this,goods,num);
    }
    public  void sendGiftToSomeone(Member receiver,GoodsEnum goods,Integer num){
        System.out.println(userName + "给"+receiver.getUserName()+"送出礼物："+goods +"*"+num.toString());
        myClub.sendGiftToSomeone(this,receiver,goods,num);
    }
}
