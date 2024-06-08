package test_15;

public class Outer {
    private String name;

    private class Inner{

    }
    //通过创建方法返回私有内部类
    public  Inner getInstance(){
        return  new Inner();
    }

}
