package Model.Plant;

public class HybridCorn implements ShowLikePotato {
    Corn c=new Corn();

    @Override
    public void showLikePotato() {
        System.out.println("杂交后的"+c.getName() + c.getId() + "像土豆一样正在生长");
    }
}
