package Operation;

public class OperationFacade {
    private Operation buyOperation;
    private Operation sickOperation;
    private Operation visitOperation;

    public OperationFacade(){
        buyOperation = new BuyOperation();
        sickOperation = new SickOperation();
        visitOperation = new VisitOperation();
    }

    public void buy(String name){
        buyOperation.peopleOperation(name);
    }

    public void livestockSick(String name){
        sickOperation.peopleOperation(name);
    }

    public void visit(String name){
        visitOperation.peopleOperation(name);
    }
}
