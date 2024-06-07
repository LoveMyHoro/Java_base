package test_6;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*public void KeepPet(Dog dog,String something){
        System.out.printf("年龄为%s的%s养了一条%s的%s岁的狗",this.age,this.name,dog.getColor(),dog.getAge());
        System.out.println();
        dog.Eat(something);

    }
    public void KeepPet(Cat cat,String somthing){
        System.out.printf("年龄为%s的%s养了一只%s的%s岁的猫",this.age,this.name,cat.getColor(),cat.getAge());
        System.out.println();
        cat.Eat(somthing);
    }*/
    public void KeepPet(Animal a,String something){
        if(a instanceof Dog b){
            System.out.printf("年龄为%s的%s养了一条%s的%s岁的狗",this.age,this.name,b.getColor(),b.getAge());
            System.out.println();
            b.Eat(something);
        }
        else if(a instanceof Cat b){
            System.out.printf("年龄为%s的%s养了一只%s的%s岁的猫",this.age,this.name,b.getColor(),b.getAge());
            System.out.println();
            b.Eat(something);
        }
    }
}
