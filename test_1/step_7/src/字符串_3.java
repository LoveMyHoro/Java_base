public class 字符串_3 {
    public static void main(String[] args) {
        //1.StringBuilder概述：
        //（1）StringBuilder可以看成一个容器，创建之后里面的内容是可变的
        //（2）因为StringBuilder是java已经写好的类，java在底层对它做了一些处理，所以它打印的对象不是地址值而是属性值（容器内的内容）
        //作用：提高字符串操作效率
        //2.构造方法
        //（1）空参构造：StringBuilder()
        //（2）含参构造：StringBuilder(String str)
        StringBuilder sb=new StringBuilder("abc");
        //3.常用方法
        //（1）append(任意类型)：添加对象，并返回对象本身
        //（2）reverse()：反转容器中的内容
        //length()：返回长度
        //toString()：把StringBuilder转化为String
        sb.append(1).append(true).reverse();
        System.out.println(sb.length());
        System.out.println(sb);
        String s1=sb.toString();
        System.out.println(s1);
        //4.StringBuilder通常应用场景
        //（1）字符串的拼接
        //（2）字符串的反转



        //5.链式编程：
        //当我们在调用一个方法的时候，不需要用变量接收它的结果，可以继续调用其他方法
        sb.append(7).append(64).reverse();
        System.out.println(sb);
    }
}
