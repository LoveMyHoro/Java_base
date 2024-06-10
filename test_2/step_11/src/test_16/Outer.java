package test_16;

import com.sun.source.tree.PackageTree;

import java.sql.SQLOutput;

public class Outer {
    private int a=10;
    public void show(){
        class Inner{
            private String name;
            private int age;

            public Inner(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void method(){
                System.out.println(a);
                System.out.println("这是局部内部类的方法");
            }
        }
        Inner i1=new Inner("喵喵喵",22);
        i1.method();
    }
}
