package test_10;

import test_9.Animal;

public class Frog extends Animal implements Swim{
    @Override
    public void swim(){
        System.out.println("青蛙在游泳");
    }
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override

    public void Eat(){
        System.out.println("青蛙在吃虫子");
    }
}
