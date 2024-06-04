import java.util.ArrayList;
import java.util.Scanner;

public class test_4_添加用户对象并判断是否存在 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<User> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            User u1=new User();
            System.out.println("请输入用户id：");
            String id=sc.next();
            System.out.println("请输入用户名称：");
            String username=sc.next();
            System.out.println("请输入密码：");
            String password=sc.next();
            u1.setId(id);
            u1.setUsername(username);
            u1.setPassword(password);
            list.add(u1);

        }
        System.out.println("请输入要查找的id:");
        String fid=sc.next();
        contains(list,fid);

    }
    public  static boolean contains(ArrayList<User>list,String id){
        return getindex(list,id)>=0;//对返回值进行判断
    }
    public static int getindex(ArrayList<User> list, String fid) {
        int temp=-1;
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i).getId()+" "+list.get(i).getUsername()+" "+list.get(i).getPassword());
            if(fid.equals(list.get(i).getId())){
                temp=i;
                break;
            }
        }
        return temp;
    }
}
