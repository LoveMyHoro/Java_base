import java.util.StringJoiner;

public class 字符串_4 {
    public static void main(String[] args) {
        //1.StringJoiner
        //StringJoiner和StringBuilder一样，也可以看做一个容器，创建之后里面的内容是可变的
        //作用：提高字符串的操作效率，而且代码编写特别简洁，但是市场上很少有人用

        //2.StringJoiner构造函数
        //（1）StringJoiner(间隔符号)：创建一个StringJoiner对象，指定拼接时的间隔符号
        //（2）StringJoiner(间隔符号,开始符号,结束符号)：创建一个StringJoiner对象，指定拼接时的间隔符号，开始符号，结束符号
        StringJoiner sj=new StringJoiner(",","[","]");

        //3.StringJoiner成员方法
        //（1）add(添加的元素)：添加数据，并返回对象本身
        //（2）length：
        //（3）toString：
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
    }
}
