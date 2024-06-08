package test_10;

public class Dog extends Animal implements Swim{
    @Override
    public void swim(){
        System.out.println("狗在狗刨");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat(){
        System.out.println("狗正在吃骨头");
    }
}
