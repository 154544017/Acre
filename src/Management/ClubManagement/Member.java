package Management.ClubManagement;

import Model.Rancher;

public abstract class Member {
    protected FarmerClub myClub;
    protected String userName;
    public Member(){}

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
        myClub.noticeAll(this,message);
    }
    public  void sendMessageToSomeone(Member receiver,String message){
        myClub.noticeSomeone(this,receiver,message);
    }
    public  void receive(Member sender,Object object){
        if(object instanceof String){
            System.out.println(userName + "收到一条来自"+sender.getUserName()+"的消息："+object);
        }else{
            //礼物可以使各种作物或畜生
        }
    }
}