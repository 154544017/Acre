package Test;

import Model.Farm.ApplyFertilizer;
import Model.Farm.Context;
import Model.Farm.Watering;
import org.junit.Test;


public class StrategyTest {

    @Test
    public void operationTest() {
        Context context = new Context(new Watering());
        context.contextInterface(1);

        context = new Context(new ApplyFertilizer());
        context.contextInterface(2);
    }

}
