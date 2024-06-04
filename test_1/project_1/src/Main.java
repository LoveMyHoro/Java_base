import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------欢迎来到Horo的学生管理系统----------------");
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        ArrayList<stu>list=new ArrayList<>();
        while(flag){
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("6：遍历学生列表");
            System.out.println("请输入你的选择：");
            int n=sc.nextInt();
            switch (n){
                case 1->{
                    Add(list);
                }
                case 2->{
                    System.out.println("请输入要删除的id:");
                    String id=sc.next();
                    if(Check(list,id)){
                        list=Delete(list,id);
                    }
                    else {
                        System.out.println("id不存在！退出操作");
                    }
                }
                case 3->{
                    System.out.println("请输入要修改的id:");
                    String id=sc.next();
                    if(Check(list,id)){
                        list=Alter(list,id);
                    }
                    else {
                        System.out.println("id不存在！退出操作");
                    }
                }
                case 4->{
                    System.out.println("请输入要查询的id:");
                    String id=sc.next();
                    if(Check(list,id)){
                        int i=Find(list,id);
                        stu s1=list.get(i);
                        System.out.printf("%s\t%s\t%s\t%s",s1.getId(),s1.getName(),s1.getAge(),s1.getAddress());
                        System.out.println();
                    }

                }
                case 5->{
                    flag=false;
                }
                case 6->{
                    Show(list);
                }
                default -> {
                    System.out.println("输入有误，请重新输入！！！");
                }
            }
        }
        System.out.println("赫萝感谢你的使用");
    }
    public static void Add(ArrayList<stu> list){
        Scanner sc=new Scanner(System.in);
        stu s1=new stu();
        System.out.println("请输入学生的id");
        String id=sc.next();
        boolean flag=Check(list,id);
        if(flag){
            System.out.println("id已存在！退出操作");
            return;
        }
        s1.setId(id);
        System.out.println("请输入学生的姓名");
        String name=sc.next();
        s1.setName(name);
        System.out.println("请输入学生的年龄");
        int age=sc.nextInt();
        s1.setAge(age);
        System.out.println("请输入学生的家庭地址");
        String address=sc.next();
        s1.setAddress(address);
        list.add(s1);
    }
    public static void Show(ArrayList<stu> list){
        System.out.println("Id    "+"Name    "+"Age    "+"Address    ");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s\t%s\t%s\t%s",list.get(i).getId(),list.get(i).getName(),list.get(i).getAge(),list.get(i).getAddress());
            System.out.println();
        }
    }
    public static  boolean Check(ArrayList<stu>list,String id){//检测是否有这个学生
        return Find(list,id)>=0;
    }
    public static  int Find(ArrayList<stu> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public static ArrayList<stu> Delete(ArrayList<stu> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                list.remove(i);
                System.out.println("删除成功！");
                break;
            }
        }
        return list;
    }
    public static ArrayList<stu> Alter(ArrayList<stu> list,String id){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                stu s1=list.get(i);
                boolean temp=true;
                System.out.println("请选择要修改的内容：");
                while(temp){
                    System.out.println("1：修改id");
                    System.out.println("2：修改name");
                    System.out.println("3：修改age");
                    System.out.println("4：修改address");
                    System.out.println("5：修改完成，退出进程");
                    int n=sc.nextInt();
                    switch (n){
                        case 1->{
                            System.out.println("请输入修改后的id:");
                            String id2=sc.next();
                            s1.setId(id2);
                        }
                        case 2->{
                            System.out.println("请输入修改后的name:");
                            String name=sc.next();
                            s1.setName(name);
                        }
                        case 3->{
                            System.out.println("请输入修改后的age:");
                            int age=sc.nextInt();
                            s1.setAge(age);
                        }
                        case 4->{
                            System.out.println("请输入修改后的address:");
                            String address=sc.next();
                            s1.setAddress(address);
                        }
                        case 5->{
                            temp=false;
                        }
                        default -> {
                            System.out.println("输入错误！请重新输入");
                        }
                    }

                }
                list.set(i,s1);
            }
        }

        return list;
    }
}
