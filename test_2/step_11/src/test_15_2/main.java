package test_15_2;

public class main {
    public static void main(String[] args) {
        Outer.Inner oi=new Outer().new Inner();
        oi.show();

    }
}
