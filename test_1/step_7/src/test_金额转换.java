import java.util.Scanner;

public class test_金额转换 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        while(true){
            System.out.println("请输入要转换的金额：");
            n=sc.nextInt();
            if(n>=0&&n<=9999999){
                break;
            }
            else {
                System.out.println("输入错误");
            }
        }
        String s1=Change(n);
        System.out.println(s1);
    }
    public static String Change(int n){
        String temp="";
        String []unit={"百","十","万","仟","百","十","元"};
        String []han={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        for(int i=6;i>=0;i--){
            int cnt=n%10;
            temp=han[cnt]+unit[i]+temp;
            n/=10;
        }
        return temp;
    }
}
