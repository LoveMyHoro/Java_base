package test_4;

import test_4.Person;

public class Student extends Person {
    public Student(){
        System.out.println("子类的无参构造");
    }
    public Student(String name){
        super(name);
    }
    public void Name(){
        this.ShowName();
    }
}