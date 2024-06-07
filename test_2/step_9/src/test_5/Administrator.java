package test_5;

public class Administrator extends Person{
    @Override
    public void show(){
        System.out.println("管理员的下姓名是"+this.getName());
    }
}
