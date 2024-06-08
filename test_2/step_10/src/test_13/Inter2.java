package test_13;

public interface Inter2 {
    public default void method1(){
        System.out.println("方法执行中");
        this.show();
    }
    public static void method2(){
        System.out.println("方法执行中");
        show2();
    }
    private void show(){//
        System.out.println("这里是执行日志");
    }
    private static void show2(){
        System.out.println("这里是执行日志");
    }


}
