package test_15;

public class main {
    public static void main(String[] args) {
        Outer o=new Outer();
        //父类接收子类
        Object i1=o.getInstance();
        //或者直接使用
        System.out.println(o.getInstance());
    }
}
