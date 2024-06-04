//1.在java项目中.先判断格式是否准确，在判断是否重复

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<stu>list=new ArrayList<>();
        ArrayList<user>u_list=new ArrayList<>();
        System.out.println("-------------欢迎来到Horo的学生管理系统----------------");
        user:while (true)
        {
            System.out.println("请选择操作1登录 2注册 3忘记密码,4退出应用");
            String choose=sc.next();
            switch (choose){
                case "1"->{
                    if(Login(u_list)){
                        StudentSystem ss=new StudentSystem();
                        ss.Entre();
                        //Manager(list);
                    }
                }
                case "2"->{
                    Register(u_list);
                }
                case "3"->{
                    Forgot(u_list);
            }
                case "4"->{
                    break user;
            }
                default -> {
                    System.out.println("输入无效，请重新输入！");
                }
        }
        }
        ShowUser(u_list);
    }
    public static void ShowUser(ArrayList<user>list){
        for (int i = 0; i < list.size(); i++) {
            user u=list.get(i);
            System.out.printf("%s\t%s\t%s\t%s",u.getUserName(),u.getPassword(),u.getCardId(),u.getPhoneNumber());
            System.out.println();
        }
    }
    public static void Forgot(ArrayList<user> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name=sc.next();
        int i=CheckUserName(list,name);
        if(i<0){
            System.out.println("用户不存在！请先注册");
            return;
        }
        else{
            System.out.println("请输入账号绑定的身份证号：");
            String ID=sc.next();
            System.out.println("请输入账号绑定的手机号：");
            String number=sc.next();
            user u1=list.get(i);
            if(u1.getCardId().equalsIgnoreCase(ID)&&u1.getPhoneNumber().equals(number)){
                System.out.print("验证成功！");
                SetPassword(sc,u1);
                System.out.println("密码修改成功！");
            }
            else{
                System.out.println("账号信息不匹配，修改失败！");
                return;
            }
        }
    }
    public static void Register(ArrayList<user> list){
        Scanner sc=new Scanner(System.in);
        user u1=new user();

        SetName(list, sc, u1);
        SetPassword(sc, u1);
        SetID(sc, u1);
        SetNumber(sc, u1);

        list.add(u1);
        System.out.println("注册成功！");
    }

    public static void SetNumber(Scanner sc, user u1) {
        System.out.println("请输入手机号码：");
        String number= sc.next();
        while(true){
            if(number.length()==11){
                if(number.charAt(0)!='0'){
                    boolean flag=true;
                    for(int i=0;i<11;i++){
                        if(number.charAt(i)<'0'||number.charAt(i)>'9'){
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        break;
                    }
                    else{
                        System.out.println("号码中不能包含字母！请重新输入：");
                    }
                }
                else{
                    System.out.println("号码首字母不能为0！请重新输入：");
                }
            }
            else{
                System.out.println("号码长度不正确！请重新输入");
            }
            number= sc.next();
        }
        u1.setPhoneNumber(number);
    }

    public static void SetID(Scanner sc, user u1) {
        System.out.println("请输入身份证号码：");
        String ID= sc.next();
        while(true){
            if(ID.length()==18){
                int temp=ID.charAt(0)-'0';
                if(temp!=0){
                    char temp2= ID.charAt(17);
                    if(((temp2>='0')&&(temp2<='9'))||temp2=='x'||temp2=='X')
                    {
                        boolean temp3=true;
                        for(int i=0;i<17;i++){
                            if(ID.charAt(i)<'0'||ID.charAt(i)>'9'){
                                temp3=false;
                                //System.out.println(ID.charAt(i));
                                System.out.println("身份证不能包含字母！（“x”,“X”除外）请重新输入");
                                break;
                            }
                        }
                        if(temp3){
                            break;
                        }
                    }
                    else{
                        System.out.println("身份证不能包含字母！（“x”,“X”除外）请重新输入");
                    }

                }
                else{
                    System.out.println("身份证首字母不能为0！请重新输入：");
                }
            }
            else{
                System.out.println("身份证长度应为18位！请重新输入");
            }
            ID= sc.next();
        }
        u1.setCardId(ID);
    }
    public static void SetPassword(Scanner sc, user u1) {
        System.out.println("请输入密码：");
        while(true){
            String password= sc.next();
            System.out.println("请再次确认密码：");
            String password2= sc.next();
            if(password.equals(password2)){
                u1.setPassword(password);
                break;
            }
            else{
                System.out.println("两次密码不一致，请重新输入密码！");
            }
        }
    }

    public static void SetName(ArrayList<user> list, Scanner sc, user u1) {
        System.out.println("请输入用户名：");
        String name= sc.next();
        while(true){
            int length=name.length();
            if (length<3||length>15) {
                System.out.println("用户名长度错误！请重新输入：");
                name= sc.next();
                continue;
            }
            boolean flag=false;
            int cnt=0;
            for(int i=0;i<name.length();i++){
                char c=name.charAt(i);
                if(!((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))){
                    flag=true;
                    break;
                }
                if(((c>='a'&&c<='z')||(c>='A'&&c<='Z'))){
                    cnt+=1;
                    break;
                }

            }
            if(flag){
                System.out.println("用户名只能是数字和字母的组合！请重新输入：");
                name= sc.next();
                continue;
            }
            if(cnt==0){
                System.out.println("用户名不能是纯数字！请重新输入：");
                name=sc.next();
                continue;
            }
            if(CheckUserName(list,name)>=0){
                System.out.println("用户名已存在！请重新输入：");
                name= sc.next();
                continue;
            }
            break;
        }

        u1.setUserName(name);
    }

    public static boolean Login(ArrayList<user> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name=sc.next();
        int name_index=CheckUserName(list,name);
        if(name_index<0){
            System.out.println("用户名未注册，请先注册");
            return false;
        };
        System.out.println("请输入登录密码：");
        String password=sc.next();
        System.out.println("请输入验证码：");
        String s1=Captcha();
        System.out.println(s1);
        String s2=sc.next();
        while(true){
            if(s1.equalsIgnoreCase(s2)){
                break;
            }
            System.out.println("验证码错误请重新输入");
            System.out.println(s1);
            s2=sc.next();
        }
        for(int i=0;i<2;i++){
            if(!list.get(name_index).getPassword().equals(password)){
                System.out.printf("密码输入错误，您还有%s次机会",2-i);
                System.out.println();
                System.out.println("请重新输入密码：");
                password=sc.next();
            }
            else{
                System.out.println("登录成功！可以使用系统了");
                System.out.println();
                return true;
            }
        }
        System.out.println("登陆失败！2");
        return false;


    }
    public static String Captcha(){
        Random r=new Random();
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            list.add((char)(i+'a'));
            list.add((char)(i+'A'));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++){
            int number=r.nextInt(list.size());
            sb.append(list.get(number));
        }
        int number=r.nextInt(10);
        sb.append(number);
        //如果我们要修改字符串中的内容，先把字符串变成字符数组
        //在数组中修改，然后再创建一个新的字符串
        char []arr=sb.toString().toCharArray();
        //拿随机索引与最后一个索引交换
        int randomIndex=r.nextInt(arr.length);
        char temp=arr[randomIndex];
        arr[randomIndex]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return new String(arr);
    }
    public static int CheckUserName(ArrayList<user>list, String Name){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUserName().equals(Name))
            {
                return i;
            }
        }
        return -1;
    }

    public static void Manager(ArrayList<stu> list) {
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
                case "1"->{
                    Add(list);
                }
                case "2"->{
                    Delete(list);
                }
                case "3"->{
                    Alter(list);
                }
                case "4"->{
                    Check(list);
                }
                case "5"->{
                    break loop;//loop是while循环别名，这里意为跳出loop循环
                    //System.exit(0);//也可以用这个语句，关闭虚拟机
                }
                case "6"->{
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
        }
        System.out.println("查询成功！");
    }
}
