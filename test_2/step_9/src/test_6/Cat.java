package test_6;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    public void CatchMouse(){
        System.out.println("猫在抓老鼠");
    }
    @Override
    public void Eat(String something){
        System.out.printf("%s岁的%s的猫眯着眼睛侧着头吃%s",this.getAge(),this.getColor(),something);
        System.out.println();
    }
}
