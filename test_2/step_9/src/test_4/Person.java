package test_4;

public class Person {
    private String name;
    public Person(){
        this("明日香");//默认初始值
        System.out.println("父类的无参构造");
    }
    public Person(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void ShowName(){
        System.out.println("我的名字是"+this.name);
    }
    public void Eat(){
        System.out.println("我在吃饭");
    }
}
