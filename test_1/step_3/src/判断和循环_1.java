import java.util.Scanner;

public class 判断和循环_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入i值：");
        int i=sc.nextInt();

        //1.if语句(和c语言一样)
        //2.switch条件(和c语言一样)
        //（1）default可以放在任何位置
        //（2）case穿透：当i匹配case后没有遇见break,会运行下面的所有语句，直到遇到break
        switch (i){
            case 1,3,5:System.out.println("小木曾雪莱天下第一！");
                break;
            case 2,4,6:
                System.out.println("冬马和纱天下第一！");
                break;
            default:
                break;
        }
        //(3)另一种版本(当括号内只有一行时，括号可以省略)
        switch (i){
            case 1,2,3,4,5->{
                System.out.println("小木曾雪莱天下第一！");
            }
            case 6,7->System.out.println("冬马和纱天下第一！");
            default -> System.out.println("无");
        }

        //3.for循环结构（和c语言一样）
        //4.while循环结构（和C语言一样）
        //5.跳转控制语句

    }
}
