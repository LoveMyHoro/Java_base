//1.API：应用程序编程接口
//目前是JDK中提供的各种功能的java类。这些类将底层的实现封装了起来，我们不需要关心这些类是如何实现的，只需要学习如何使用
//简单理解：API就是别人已经写好的东西，我们不需要自己编写，直接使用即可（如Scanner,Random）

//
public class 字符串_1 {
    public static void main(String[] args) {
        //1.（1）字符串转数组
        String str="我是字符串";
        char []arr=str.toCharArray();
        System.out.println(arr);
        //  （2）字符数组转字符串
        //调用 String.join() 方法并传递空格作为分隔符以及其元素将与空格连接的数组。
        String str2= new String(arr);
        System.out.println(str2);

        //2.string类(字符串在创建后不能被改变)
        //(1)java程序中所有的字符串文字都被视为类的对象
        //(2)字符串的内容是不会发生改变的，它的对象在创建之后不能被更改
        String name="明日香";
        name="凯尔希";//这里并不是更改了原来的字符串，而是创建了一个新的字符串，并把字符串的值赋给了name
        //3.创建String对象的两种方式
        //（1）直接赋值
        String s1="苇草";
        //（2）new(注：键盘录入的字符串是new出来的)
        String s2=new String("阿米娅");
        //创建字符数组
        char []chs={'a','b','c','d'};
        String s3=new String(chs);
        //通过字节数组创建字符串对象
        byte []b={97,98,99,100};
        String s4=new String(b);//通过查询ascll码表生成字符数组
        System.out.println(s4);

        //4.当使用双引号直接赋值时，系统会检查该字符串在串池（StringTable）中是否存在。不存在：创建新的；存在：复用

        //5.字符串的比较
        //这里来说明“==”比较的原理
        //（1）如果比较的是基本数据类型：比较的是具体的值
        //（2）如果比较的是引用数据类型：比较的是地址值
        String s5=new String("abc");
        String s6=new String("abc");
        System.out.println(s5==s6);//false，因为创建新的对象地址不同

        String s7="abc";
        String s8="abc";
        System.out.println(s7==s8);//由于复用，所以是true

        System.out.println(s6==s8);//false,地址不同

        //6.但我们想要仅仅比较字符串的值，不考虑其存储位置时，可以调用以下方法
        //（1）boolean equals(要比较的字符串):完全一样才是true，否则为false
        //（2）boolean equalslgnoreCase(要比较的字符串)：忽略大小写（比如验证码）5
        System.out.println("--------------");
        System.out.println(s5==s6);
        boolean result1=s5.equals(s6);
        System.out.println(result1);

        //7.结论
        //以后想要比较字符串，一定要用String的方法





    }
}
