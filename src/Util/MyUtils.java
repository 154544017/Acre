package Util;

public class MyUtils {
    public static void getModifierString(Object o, String id, String func) {
        if (id == null) {
            id = "0x" + Integer.toHexString(o.hashCode());
        }
        System.out.println(o.getClass().getSimpleName() + ":" + id + ":" + func + ":");
    }

    public static String getInfo(String s){
        return "\n" + String.format("%30s", s).replace(" ","-") + "---------------------------";
    }
}