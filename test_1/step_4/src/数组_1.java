import java.util.Scanner;
//这部分内容基本和C语言相同
public class 数组_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1.数组的定义（两种形式）
        //（1）数据类型 [] 数组名
        //（2）数据类型 数组名 []

        //2.数组的初始化

        //（1）静态初始化格式：数据类型 []数组名={}
        int []array={11,22,33};
        int array2[]={33,44,55};
        System.out.println(array);//"[I@7eda2dbb"是数组的地址值，'['表示数组，'I'表示数组的元素是int类型，'@'是间隔符号，无特殊含义
        //"7eda2dbb"是数组真正的地址，16进制形式。平时我们会习惯的把这个整体叫做数组的地址值
        System.out.println(array[1]);
        //（2）动态初始化格式：数据类型 []数组名=new 数据类型[数组长度]
        //由虚拟机给出默认的初始化值
        int array3[]=new int [10];//new表示开辟空间
        System.out.println("动态数组默认初始化值："+array3[0]);//整数是0，小数是0.0，字符是'/u0000'（空格），bool是false,引用数据类型是null

        //3.获取数组长度。调用方式：数组名.length
        System.out.println(array.length);
        //4.快速遍历数组快捷方式
        //由idea提供。格式：数组名.fori
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //5.数组常见问题：数组越界
        //6.数组的复制
        int array4[]=array;//把array的地址赋值给了array4

    }
}
