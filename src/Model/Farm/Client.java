package Farm;

public class Client {

    public static void main(String[] args) {
        Context context;

        context = new Context(new Watering());
        context.contextInterface(1);

        context = new Context(new ApplyFertilizer());
        context.contextInterface(2);
    }

}
