package test_12;

public class BasketballPlayer extends Person{
    public BasketballPlayer(){

    }
    public BasketballPlayer(String name,int age){
        super(name,age);
    }
    @Override
    public void Sport(){
        System.out.printf("%s岁的篮球运动员%s会打篮球",this.getAge(),this.getName());
        System.out.println();
    }

}
