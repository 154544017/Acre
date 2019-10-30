package Test;

import Operation.Operation;
import Operation.OperationFacade;
import org.junit.Test;


public class FacadeTest {

    @Test
    public void facadeTest(){
        OperationFacade peopleOperation = new OperationFacade();
        peopleOperation.buy("牛肉");
        peopleOperation.livestockSick("幼崽");
        peopleOperation.visit("医院");
    }



}
