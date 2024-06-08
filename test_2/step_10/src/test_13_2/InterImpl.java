package test_13_2;

public class InterImpl extends InterAdapter{
    //选择调用父类的方法
    @Override
    public void method5(){
        System.out.println("通过父类导入接口，子类继承父类来选择性的重写接口");
    }
}
