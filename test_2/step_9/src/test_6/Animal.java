package test_6;

public class Animal {
    private int age;
    private String color;
    public Animal(){

    }
    public Animal(int age,String color){
        this.age=age;
        this.color=color;
    }

    public void setName(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
    public void Eat(String something){
        System.out.println("狗在吃"+something);
    }
}
