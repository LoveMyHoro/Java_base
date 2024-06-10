package test_17;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        //1.编写匿名内部类方法
        //（1）相当于对swim接口进行了重写
        //（2）new的是swim后面{}里的类
        new Swim(){
            @Override
            public void swim(){
                System.out.println("重写了游泳方法");
            }
        };

        //2.传递匿名函数的对象
        method(
                new Animal() {
                    @Override
                    public void Eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
        //3.整体我们可以理解为swim接口的实现类对象
        //接口多态
        Swim s=new Swim() {
            @Override
            public void swim() {
                System.out.println("学生会游泳");
            }
        };
        method2(s);


        //4.匿名自调
        new Swim() {
            @Override
            public void swim() {
                System.out.println("老师会游泳");
            }
        }.swim();


    }
    public static void method(Animal a){
        a.Eat();//编译看左边，运行看右边
    }
    public static void method2(Swim s){
        s.swim();
    }
}
