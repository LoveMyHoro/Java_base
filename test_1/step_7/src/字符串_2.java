import java.util.Scanner;

public class 字符串_2 {
        public static void main(String[] args) {
            //1.按索引遍历字符串每一个字符
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入要遍历的字符串：");
            String s1=sc.next();
            //  遍历（快捷键：s1.lengrh().fori）
            for (int i = 0; i < s1.length(); i++) {
                char c=s1.charAt(i);
                System.out.printf("%s ",c);
                System.out.println();
            }
            //2.查询字符Ascll码简单方法
            System.out.println((int)'0');

            //3.字符串分割（注意：字符串不能被改变，只有返回值才是替换后的结果。所有必须要有一个变量接收返回的结果）
            System.out.println("请输入手机号：");
            String n=sc.next();
            String start=n.substring(0,3);
            String end=n.substring(7);
            String result=start+"****"+end;
            System.out.println(result);

            //4.字符串替换（注意：字符串不能被改变，只有返回值才是替换后的结果。所有必须要有一个变量接收返回的结果）
            String talk="你玩的真好，下次不要再玩了，cnm";
            String result2=talk.replace("cnm","***");
            System.out.println(result2);


    }

}
