import java.util.ArrayList;
import java.util.Scanner;

public class test_3_添加学生对象并遍历 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Stu> list=new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            Stu s1=new Stu();//创建s1不能放在外面，因为每new一次创建一个新的空间。若放在外面，每次用的都是相同的空间，传给ArrayList的是相同的地址值
            System.out.println("请输入学生的姓名：");
            String name=sc.next();
            System.out.println("请输入学生的年龄：");
            int age=sc.nextInt();
            s1.setName(name);
            s1.setAge(age);
            list.add(s1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+" "+list.get(i).getAge());
        }
    }
}
