import java.util.Scanner;

public class test_3_对称字符串 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s1=sc.next();
        StringBuilder sb=new StringBuilder(s1);
        String s2=sb.reverse().toString();
        boolean result=s1.equals(s2);
        if(result==true){
            System.out.println("对称");
        }
        else{
            System.out.println("不对称");
        }

    }
}
