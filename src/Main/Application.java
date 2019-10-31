package Main;

public class Application {
    private static Application ourInstance = new Application();

    public static Application getInstance() {
        return ourInstance;
    }

    private Application() {

    }
    private boolean exit;

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    public void run() {
        System.out.println("Welcome to Acre Farm.");
        exit = false;
        while(!exit) {
            // 获取输入,执行各种命令
            //String command =
            //execute(command)

        }

    }

}
