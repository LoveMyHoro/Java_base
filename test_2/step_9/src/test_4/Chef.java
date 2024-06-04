package test_4;

public class Chef extends Employee{
    public Chef(){

    }
    public Chef(String id,String name,int wage){
        super(id,name,wage);
    }
    public void Work(){
        System.out.println("炒菜");
    }
}
