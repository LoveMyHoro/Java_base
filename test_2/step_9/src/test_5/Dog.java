package test_5;

public class Dog extends Animal{
    public int weight=100;
    public Dog() {
    }

    public Dog(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }
    @Override
    public void Eat(){
        System.out.println("狗在吃饭");
    }
    public void Work(){
        System.out.println("狗在看家");
    }
}
