import test_2.MaxAge;
import test_2.Student;

import java.util.ArrayList;

//stastic变量（存储在堆内存的静态区）
//静态变量是随着类的加载而加载的，优于对象而出现的
//static表示静态，是java中的一个修饰符，可以修饰成员方法，成员变量
public class 面向对象进阶_1_static {
    public static void main(String[] args) {
        //创建一个学生对象并调用
        Student s1=new Student();
        //1.被static修饰的成员变量，叫做静态变量
        //特点：被所有成员共享
        //调用方式：类名调用（推荐）
        //        对象名调用
        Student.setTeacher("战场原");
        s1.setName("明日香");
        s1.setAge(18);
        s1.setGender("女");

        s1.show();
        s1.study();
        Student s2=new Student();
        s2.setName("赫萝");
        s2.setAge(15);
        s2.setGender("女");

        s2.show();
        s2.study();
        //2.被static修饰的成员方法，叫做静态方法
        //特点：多用于测试类和工具类中。在javabean中很少会用
        //调用方式：类名调用（推荐）
        //        对象名调用
        //3.类的区分
        //（1）javabean类：用来描述一些事物的类，比如：test_2.Student,DOg,Cat等
        //（2）测试类：用来检查其他类是否书写正确，带有main方法的类，是程序的入口
        //（3）工具类：不是用来描述一类事物的，而是帮我们做一些事情的类

        //4.工具类：
        //（1）类名见名知意
        //（2）私有化构造方法（因为这个类是个"工具“,创建对象没有意义）
        //（3）方法都是静态的，方便调用
        int []arr1={1,2,3,4,5};
        String s3=ArrayUtil.printArr(arr1);
        System.out.println(s3);
        double []arr2={1.2,2.3,4.4,5.6,9};
        double aver=ArrayUtil.getAverage(arr2);
        System.out.println(aver);
        //5.练习
        ArrayList<Student>list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        System.out.println(MaxAge.Max(list));

        //6.static的注意事项
        //在此之前要知道：this代表当前方法调用者的地址值。由虚拟机赋值
        //（1）静态方法中，只能访问静态变量和方法
        //因为静态方法中没有this关键字,所以不能调用非静态方法

        //（2）非静态方法无限制
        //有this没问题

        //（3）静态方法中没有this关键字
        //非静态方法通常与对象相关，所以以需要this获得对象的地址值
        //而静态方法是共享的，不与某个特定的对象相关

        //7.重新认识main方法
        //public :被JVM(虚拟机)调用，访问权限足够大
        //static :被JVM调用，不用创建对象，直接类名访问
        //        且由于main方法是静态的，所以测试类中的其他方法也需要是静态的；
        //void   :被JVM调用，不需要给JVM返回值
        //main   :一个通用的名称，虽然不是关键字，但是只有main才能被JVM识别
        //String[] args:以前用于接收键盘录入数据的，现在没用。java为了向下兼容，保留了

    }

}
