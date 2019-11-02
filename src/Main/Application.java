package Main;

import Model.Scene.Scene;

public class Application {
    private static Application ourInstance = new Application();
    private Scene farmScene;

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

        }
    }

    public void switchScene(){

    }
}
