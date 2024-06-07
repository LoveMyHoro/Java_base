import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

        private static final String ADD_STUDENT="1";
        private static final String DELETE_STUDENT="2";
        private static final String ALTER_STUDENT="3";
        private static final String ENQUIRY_STUDENT="4";
        private static final String EXIT="5";
        private static final String RERVERSE="6";

        public static void Entre() {
        ArrayList<stu>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        loop:while(true){
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("6：遍历学生列表");
            System.out.println("请输入你的选择：");
            String n=sc.next();
            switch (n){
                case ADD_STUDENT->{
                    Add(list);
                }
                case DELETE_STUDENT->{
                    Delete(list);
                }
                case ALTER_STUDENT->{
                    Alter(list);
                }
                case ENQUIRY_STUDENT->{
                    Check(list);
                }
                case EXIT->{
                    break loop;//loop是while循环别名，这里意为跳出loop循环
                    //System.exit(0);//也可以用这个语句，关闭虚拟机
                }
                case RERVERSE->{
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
        System.out.println("添加成功！");
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
    public static void Delete(ArrayList<stu> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除的id:");
        String id=sc.next();
        if(!Check(list,id)){
            System.out.println("id不存在！退出操作");
            return;
        }
        int i=Find(list,id);
        list.remove(i);
        System.out.println("删除成功！");
    }
    public static void Alter(ArrayList<stu> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改的id:");
        String id=sc.next();
        if(!Check(list,id)){
            System.out.println("id不存在！退出操作");
            return;
        }
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

    }
    public static void Check(ArrayList<stu>list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查询的id:");
        String id=sc.next();
        if(Check(list,id)){
            int i=Find(list,id);
            stu s1=list.get(i);
            System.out.println("Id    "+"Name    "+"Age    "+"Address    ");
            System.out.printf("%s\t%s\t%s\t%s",s1.getId(),s1.getName(),s1.getAge(),s1.getAddress());
            System.out.println();
            System.out.println("查询成功！");
        }
        else{
            System.out.println("查询失败！");
        }
    }













}
