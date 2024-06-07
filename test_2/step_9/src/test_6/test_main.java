package test_6;

public class test_main {
    public static void main(String[] args) {
        Dog d1=new Dog(12,"黑颜色");
        Cat c1=new Cat(12,"灰颜色");
        Person p1=new Person("老王",30);
        Person p2=new Person("老李",25);
        p1.KeepPet(d1,"骨头");
        p2.KeepPet(c1,"鱼");
    }
}
