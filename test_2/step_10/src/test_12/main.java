package test_12;

public class main {
    public static void main(String[] args) {
        BasketballPlayer b1=new BasketballPlayer("小明",11);
        BasketballTeacher b2=new BasketballTeacher("小张",21);
        PingPlayer p1=new PingPlayer("李复国",12);
        PingTeacher p2=new PingTeacher("航",33);
        p1.Sport();
        p1.SpeakEnglish();

        b1.Sport();

    }
}
