package test_4;

import java.awt.*;

public class Employee {
    private String id;
    private String name;
    private int wage;
    public Employee(){

    }
    public Employee(String id,String name,int wage){
        this.id=id;
        this.name=name;
        this.wage=wage;
    }
    public  void setId(){
        this.id=id;
    }
    public void setName(){
        this.name=name;
    }
    public void setWage(){
        this.wage=wage;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    public void show(){
        System.out.printf("%s\t%s\t%s",this.id,this.name,this.wage);
        System.out.println();
    }


    public void Eat(){
        System.out.println("吃米饭");
    }
}
