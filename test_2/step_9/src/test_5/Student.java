package test_5;

import com.sun.tools.attach.AgentInitializationException;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age){
        super(name, age);
    }
    @Override
    public void show(){
        System.out.printf("学生的姓名是%s",this.getName());
        System.out.println();
    }
}
