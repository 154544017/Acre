package Model.Plant;

public class HybridCorn extends Corn implements ShowLikePotato {
    private static String name = "HybridCorn";
    private static int count = 0;
    public void setId() {
        this.id = count++;
    }
    public HybridCorn() {

    }
    public String getSelf() {
        return showLikePotato()+name + id;
    }

    public String showLikePotato() {
        return "杂交后长得像土豆一样快的";
    }
}
