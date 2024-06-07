package test_5;

public class Person {
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.printf("%s\t%s",this.name,this.age);
        System.out.println();
    }
}
