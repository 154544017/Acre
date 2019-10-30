package Operation;

public class BuyOperation implements Operation {
    @Override
    public void peopleOperation(String name) {
        System.out.println("驾车前往农牧市场");
        System.out.println("询问"+name+"的价格");
        System.out.println("货比三家并购买");
        System.out.println("驾车返回");
    }
}
