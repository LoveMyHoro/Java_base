package test_6;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    public void LookHome(){
        System.out.println("狗正在看家");
    }
    @Override
    public void Eat(String somthing){
        System.out.printf("%s岁的%s的狗两只前脚死死的抱住%s猛吃",this.getAge(),this.getColor(),somthing);
        System.out.println();
    }
}
