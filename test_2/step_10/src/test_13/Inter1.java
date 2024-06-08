package test_13;

public interface Inter1 {
    public abstract void method();
    public default void show(){
        System.out.println("这是接口Inter1的默认方法--show");
    }
}
