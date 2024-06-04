import java.util.ArrayList;

public class test_2_包装类 {
    public static void main(String[] args) {
        //1.基本数据类型的包装类
        //（1）除了int->Integer,char->Character,其余的都是首字母大写
        //（2）int 和Integer之间可以互相转化
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }
            else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");

    }
}
