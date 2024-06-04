import java.util.Scanner;
//跳过被7整除和包含7的数
public class test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp=i,cnt=1;
            if(temp%7==0){
                cnt=0;
            }
            else{
                while(temp>0){
                    int cnt2=temp%10;
                    temp/=10;
                    if(cnt2==7){
                        cnt=0;
                    }
                }
            }
            if(cnt==1){
                System.out.println(i);
            }
            else{
                System.out.println("过");
            }
        }

    }
}

