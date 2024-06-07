package test_5;

public class Teacher extends Person{

    public Teacher(String name,int age){
        super(name,age);
    }
    @Override
    public void show(){
        System.out.println("老师的姓名是"+this.getName());
    }
}
