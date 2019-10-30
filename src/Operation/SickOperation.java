package Operation;

public class SickOperation implements Operation {
    @Override
    public void peopleOperation(String name) {
        System.out.println(name+"生病了");
        System.out.println("驾车前往畜牧医院寻找兽医");
        System.out.println("带兽医回来看病");
        System.out.println("··········");
        System.out.println(name+"病好了");
    }
}
