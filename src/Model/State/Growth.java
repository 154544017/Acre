package Model.State;

import Util.MyUtils;

public class Growth implements State{
    @Override
    public void react() {
        MyUtils.getModifierString(this,null,"react:");
        System.out.println("状态变为生长期");
    }

    @Override
    public int getNum() {
        return 2;
    }

    @Override
    public String toString() {
        return "状态:生长期";
    }
}
