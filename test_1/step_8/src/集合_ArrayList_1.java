import java.util.ArrayList;

public class 集合_ArrayList_1 {
    public static void main(String[] args) {
        //1.集合和数组的比较
        //（1）长度：数组的长度是固定的，集合的长度是可变的
        //（2）存储类型：数组：可以存基本数据类型，也可以存引用数据类型。集合：可以存取引用类型，在存取基本类型时要以包装类的形式
        //（3）基本数据类型的包装类：除了int->Integer,char->Character,其余的都是首字母大写。int 和Integer之间可以互相转化
        //
        //2.ArrayList学习
        //创建集合对象
        //泛型：限定集合中存储的基本数据类型
        ArrayList<String> list=new ArrayList<>();//arr集合以后只能存取String类型数据
        System.out.println(list);
        //由于ArrayList是java已经写好的类，这个类在底层做了一些处理。它打印的对象不是地址值而是集合中存取的内容
        //在展示的时候会拿[]吧所有的类包裹

        //3.ArrayList成员方法
        //（1）增：add()
        list.add("abc");//返回值是true
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        //（2）删：有两种删除方式
        //remove(要删除的数据):删除成功返回true，失败返回false
        //remove(索引):返回删除的元素
        boolean flag=list.remove("abc");
        System.out.println(flag);
        System.out.println(list);
        String s2=list.remove(0);
        System.out.println(s2);
        System.out.println(list);
        //（3）改：set()
        //格式：set(index,新值)，返回的是被覆盖的值
        s2=list.set(0,"eee");
        System.out.println(s2);
        System.out.println(list);
        //（4）查：get(index):返回的是索引值
        // size()：查询集合大小
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //4.当我们要返回多个数据时，可以把这些数据先放到一个容器中，在把容器返回
        //这个容器可以是集合，数组等



    }
}
