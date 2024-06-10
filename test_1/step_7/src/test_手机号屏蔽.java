import java.util.Scanner;

public class test_手机号屏蔽 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入手机号：");
        String n=sc.next();
        String start=n.substring(0,3);
        String end=n.substring(7);
        String result=start+"****"+end;
        System.out.println(result);
        System.out.println(n.charAt(0));
    }
}
