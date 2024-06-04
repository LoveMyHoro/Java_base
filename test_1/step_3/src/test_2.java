import java.util.Random;
import java.util.Scanner;

//猜数字小游戏（要利用到Random）
public class test_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int number=r.nextInt(100)+1;//生成的1~100的数
        System.out.println("请输入您猜测的数字：");
        int temp=sc.nextInt(),cnt=0,count=1;
        while(cnt==0){
            if(temp==number){
                cnt=1;
                System.out.println("恭喜你，猜对了！共花费了"+count+"次");
            }
            else if(temp>number){
                System.out.println("您猜的数大了，请重新输入：");
                temp=sc.nextInt();
                count+=1;
            }
            else {
                System.out.println("您猜的数小了，请重新输入：");
                temp=sc.nextInt();
                count+=1;
            }
        }



    }
}
