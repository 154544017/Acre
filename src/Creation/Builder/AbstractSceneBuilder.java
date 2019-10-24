package Creation.Builder;

public interface AbstractSceneBuilder {
    default void buildBackground(){
        System.out.println("背景加载成功");
    }

    default void buildDecoration(){
        System.out.println("装饰加载成功");
    }
}
