//1.在java项目中.先判断格式是否准确，在判断是否重复

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static ArrayList<user>u_list=new ArrayList<>();
    static {
        user u1=new user("明日香","112","411525200308261556","15670551809");
        u_list.add(u1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<stu>list=new ArrayList<>();
        //ArrayList<user>u_list=new ArrayList<>();
        System.out.println("-------------欢迎来到Horo的学生管理系统----------------");
        user:while (true)
        {
            System.out.println("请选择操作1登录 2注册 3忘记密码,4退出应用");
            String choose=sc.next();
            switch (choose){
                case "1"->{
                    if(Login(u_list)){
                        StudentSystem ss=new StudentSystem();
                        StudentSystem.Entre();


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
}
