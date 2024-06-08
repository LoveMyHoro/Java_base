package test_12;

public class PingTeacher extends Person implements English{
    public PingTeacher() {
    }

    public PingTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void Sport(){
        System.out.printf("%s岁的乒乓球球教练%s教打乒乓球",this.getAge(),this.getName());
        System.out.println();
    }
    @Override
    public void SpeakEnglish(){
        System.out.println(this.getName()+"会说英语");
    }
}
