package Test;
import Model.Plant.HybridCorn;
import org.junit.Test;
public class AdapaterTest {
    @Test
    public void adapterTest(){
        HybridCorn h=new HybridCorn();
        h.showLikePotato();
    }
}
