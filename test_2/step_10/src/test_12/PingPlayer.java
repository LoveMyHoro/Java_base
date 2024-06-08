package test_12;

public class PingPlayer extends Person implements English{
    public PingPlayer() {
    }

    public PingPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void Sport(){
        System.out.printf("%s岁的乒乓球运动员%s会打乒乓球",this.getAge(),this.getName());
        System.out.println();
    }
    @Override
    public void SpeakEnglish(){
        System.out.println(this.getName()+"会说英语");
    }
}
