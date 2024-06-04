import java.util.Scanner;

public class 运算符_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1.自增自减
        int a=1,b=2,c=7;
        a++;
        b+=1;
        System.out.println(a);
        System.out.println(a==b);

        //2.三元运算符
        //格式：关系表达式？表达式1：表达式2
        //举例：求两个数中的较大值
        int max=a>b?a:b;
        System.out.println(max);






    }
}
