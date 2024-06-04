import java.util.Scanner;

public class GirlMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入女友人数：");
        int n=sc.nextInt();
        Girl []Garry=new Girl[n];
        for (int i = 0; i < n; i++) {
            Garry[i]=new  Girl();
            System.out.printf("请输入女友%s号的姓名：",i+1);
            String temp1=sc.next();
            Garry[i].setName(temp1);

            System.out.printf("请输入女友%s的年龄：",i+1);
            int temp2=sc.nextInt();
            Garry[i].setAge(temp2);

            System.out.printf("请输入女友%s的性别：",i+1);
            String temp3=sc.next();
            Garry[i].setGender(temp3);

            System.out.printf("请输入女友%s的爱好：",i+1);
            String temp4=sc.next();
            Garry[i].setHobby(temp4);
        }
        int sum=0;
        for (int i = 0; i < Garry.length; i++) {
            sum+=Garry[i].getAge();
        }
        int avg=sum/n;
        for (int i = 0; i < Garry.length; i++) {
            if(Garry[i].getAge()<=avg){
                Garry[i].show();
            }
        }
    }
}
