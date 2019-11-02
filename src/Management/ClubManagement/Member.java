package Management.ClubManagement;

import Model.Goods.Goods;
import Model.Rancher;
import Model.Stock.Stock;
import Structure.Composite.GoodsEnum;

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

    public  void sendMessageToAll(String message){
        System.out.println(userName + "给所有成员发送消息："+message);
        myClub.noticeAll(this,message);
    }
    public  void sendMessageToSomeone(Member receiver,String message){
        System.out.println(userName + "给"+receiver.getUserName()+"发送消息"+message);
        myClub.noticeSomeone(this,receiver,message);
    }

    public  void receiveMessage(Member sender,Object object){
        if(object instanceof String){
            System.out.println(userName + "收到一条来自"+sender.getUserName()+"的消息："+object);
        }else{
            System.out.println(userName + "接收到未知类型的消息："+object);
            //礼物可以使各种作物或畜生
        }
    }
    public  void receiveGift(Member sender,GoodsEnum goods,Integer num){
        System.out.println(userName + "收到"+sender.getUserName()+"的礼物："+goods +"*"+num.toString());
        Stock.getInstance().stockIn(goods,num);
    }
}