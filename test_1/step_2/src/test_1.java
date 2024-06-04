
import java.util.Scanner;

class test_1{
    public static void main(String[] args) {
        System.out.println("请输入i，j:");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt(),j=sc.nextInt();
        System.out.println(i==6||j==6);
        System.out.println((i+j)%6==0);

    }
}