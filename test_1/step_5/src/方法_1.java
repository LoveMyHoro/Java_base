public class 方法_1 {
    public static void main(String[] args) {
        int a=playgame(2,3);
        playgame();
        playgame(1);
        System.out.println(a);

    }
    //1.定义方法(和C语言基本一样)
    //形参：形式参数，是指方法定义中的参数
    //实参：实际参数，是指方法调用中的参数
    public static int  playgame(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    //2.注意事项
    //（1）方法与方法之间是平级关系
    //（2）方法的编写顺序与执行顺序无关

    //3.方法的重载
    //简单记：在同一个类中，方法名相同，参数不同的方法。与有没有返回值或者返回值的类型无关
    //参数不同（满足以下条件之一）：个数不同，类型不同，顺序不同（只需要满足其中一个条件）
    //举例如下
    public static  int playgame(){
        return 0;
    }
    public static void playgame(int num1){

    }
    //4.（1）基本数据类型：整数，浮点数，布尔，字符。
    // 数据值是存储在自己的空间中。特点：赋值给其他变量，也是赋的是真实值
    //（2）引用数据类型：凡是new（存储在堆中）出来的数据类型都是引用数据类型。引用：使用了其他空间的数据
    //数据值是存储在其他空间中，自己空间中存储的是地址值。特点：赋值给其他变量，赋的是地址值

    //5.快速抽取方法：ctrl+alt+m
}
