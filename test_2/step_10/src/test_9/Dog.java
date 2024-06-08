package test_9;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat(){
        System.out.println("吃骨头");
    }
}
