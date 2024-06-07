package test_5;

public class test_5_1 {
    public static void main(String[] args) {
        Student s1=new Student("小明",18);
        Register(s1);

        Teacher t1=new Teacher("赫萝",15);
        Register(t1);
    }
    //这个方法既可以接收老师，又能接收学生，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void Register(Person p){
        p.show();
    }
}
