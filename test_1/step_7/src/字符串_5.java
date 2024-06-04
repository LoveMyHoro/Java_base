public class 字符串_5 {
    public static void main(String[] args) {
        //字符串相关类的底层原理
        //1.字符串存储的内存原理
        //（1）直接赋值会复用字符串常量池
        //（2）new出来不会复用，而是开辟一个新的空间
        //2."=="号比较的到底是什么
        //（1）基本数据类型比较数据值
        //（2）引用数据类型比较地址值
        //3.字符串拼接的底层原理
        //（1）当拼接时没有变量：触发字符串的优化机制，在编译生成class文件时就已经是最终的结果了
        //（2）当拼接时有变量：每一行拼接的代码，都会在内存中创建新的字符串，浪费空间。创建StringBuilder容器，利用append()方法和toString()方法拼接
        //4.StringBuilder提高效率原理图
        //（1）所有要拼接的内容都会往StringBuilder中放，不会创建很多无用的空间
        //（2）字符在StringBuilder中以Ascll码形式存储
        //（3）StringBuilder默认容量为16，在添加内容超出容量时会扩充到2*16+2=34。之后再超出容量时StringBuilder的容量会等于实际存储的长度
        //（4）capacity()方法可以查询容量，length()可以查询存储的长度
        StringBuilder sb=new StringBuilder();
        sb.append("sdadsadsadsadadsadadsadasad");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        //5.时刻记住：字符串不能被更改
        //如果我们看到要修改字符串的内容，可以有以下方法
        //（1）利用sbuString截取
        //（2）利用StringBuilder存取
        //（3）可以先把字符串变为字符数组，然后处理
        //具体方法见综合练习
    }

}
