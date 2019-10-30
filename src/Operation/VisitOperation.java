package Operation;

public class VisitOperation implements Operation {
    @Override
    public void peopleOperation(String name) {
        System.out.println(name+"向你发来请帖");
        System.out.println("·········");
        System.out.println("约定的日期到了");
        System.out.println("驾车前往");
    }
}
