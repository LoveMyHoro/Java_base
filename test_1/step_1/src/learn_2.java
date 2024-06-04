//这部分学习键盘导入数据

//1.导包，找到Scanner这个类在哪，要写在类的上面
import java.util.Scanner;
public class learn_2{
    public static void main(String args[]){
        //2.创建对象，使用Scanner
        Scanner sc=new Scanner(System.in);
        //3.键盘录入
        //第一套体系
        //（1）nextInt():接收整数
        //（2）nextDouble():接收小数
        //（3）next():接收字符串
        //以上输入遇到空格，制表符，回车键停止接受。
        //第二套体系
        //（1）nextLine():接收字符串
        //以上可以接收空格，制表符，遇到回车才停止接收
        //注意，先用第一套体系再用第二套会导致nextLine接收不到数据，这会导致排查不到错误。所以通常只使用第一套体系
        System.out.println("请输入数据：");
        int i=sc.nextInt();
        System.out.println(i);
        //4.另一种输出语句：souf
        //包括两部分参数：
        //第一部分参数：要输出的内容%s（占位）
        //第二部分参数：填充的数据
        System.out.printf("%s，你看见%s了吗","凯尔西","博士");//没有换行效果
    }
}
