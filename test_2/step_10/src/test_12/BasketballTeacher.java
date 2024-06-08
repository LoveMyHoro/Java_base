package test_12;

public class BasketballTeacher extends Person{
    public BasketballTeacher() {
    }

    public BasketballTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void Sport(){
        System.out.printf("%s岁的篮球教练%s教打篮球",this.getAge(),this.getName());
        System.out.println();
    }
}
