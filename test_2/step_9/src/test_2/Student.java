package test_2;

public class Student {
    private String name;
    private int age;
    private  String gender;
    private static String teacher;

    public Student() {
    }

    public Student(String name, int age, String gender,String teacher) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.teacher=teacher;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getTeacher() {
        return teacher;
    }

    public static void setTeacher(String teacher) {
        Student.teacher = teacher;
    }

    public void study(){
        System.out.println(this.name+"正在学习");
    }
    public void show(){
        System.out.println(this.getName()+","+this.getAge()+","+this.getGender()+","+this.getTeacher());
    }

}
