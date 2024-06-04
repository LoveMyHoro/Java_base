import java.util.Scanner;

public class test_综合练习2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入A,B字符串");
        String A= sc.next(),B=sc.next();
        boolean flag=false;
        for(int i=0;i<A.length();i++){
            A=Rotate(A);
            if(A.equals(B)){
                flag=true;
            }
        }
        System.out.println(flag);
    }
    public static String Rotate(String s1){//转移一次
        char start=s1.charAt(0);
        String end=s1.substring(1);
        return  end+start;

    }
}
