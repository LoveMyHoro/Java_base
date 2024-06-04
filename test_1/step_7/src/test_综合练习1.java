import java.util.Scanner;

public class test_综合练习1 {//时刻记住：字符串不能被更改
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个长度为9的数字字符串：");
        int cnt=0;
        String s1=Scan(cnt, sc);
        String []arr={" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ",""};
        s1=Change(s1,arr);
        System.out.println(s1);

    }

    public static String Scan(int cnt, Scanner sc) {
        String s1="";
        while(cnt ==0){
            s1= sc.next();
            if(s1.length()!=9){
                System.out.println("长度不正确，请重新输入：");
            }
            else{
                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i)<'0'||s1.charAt(i)>'9'){
                        System.out.println("不是纯数字数组，请重新输入：");
                        cnt =0;
                        break;
                    }
                    cnt =1;
                }
            }
        }
        return s1;
    }
    public  static String Change(String s1,String arr[]){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            int temp=s1.charAt(i)-'0';
            sb.append(arr[temp]);
        }
        return sb.toString();

    }
}
