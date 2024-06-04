import java.util.Scanner;

public class test_统计字符次数 {
    public static void main(String[] args) {
        //1.输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s1=sc.next();
        int cntA=0,cnta=0,cnt0=0;
        for (int i = 0; i < s1.length(); i++) {
            char c=s1.charAt(i);
            if(c>='a'&&c<='z'){
                cnta+=1;
            }
            else if(c>='A'&&c<='Z'){
                cntA+=1;
            }
            else if(c>='0'&&c<='9'){
                cnt0+=1;
            }
        }
        System.out.printf("小写字母有%s个，大写字母有%s个，数字有%s个",cnta,cntA,cnt0);


    }
}
