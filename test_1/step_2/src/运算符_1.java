public class 运算符_1 {
    //结论：
    //1.整数参与计算，结果只能得到整数。如果有小数参与计算，结果有可能不精确
    //2.数字在进行运算时，数据类型不一样不能运算，需要转为一样的才能运算.有两种转换方法
    //（1）隐式转换（自动类型提升）：取值范围小->取值范围大（自动进行）
    //3.byte short char 三种类型的数据在运算的时候，都会直接先提升为int，然后再进行运算
    //4.如果把一个取值范围大的数值赋值给取值范围小的变量，是不允许直接赋值的。如果一定要这么做就需要加入强制转换
    public static void main(String[] args) {
        //（1）数字相加
        System.out.println(1.1+1.1);//2.2
        System.out.println(1.1+1.01);//2.1100000000000003
        System.out.println(10/3);//3
        System.out.println(10.0/3);//3.33333.....
        System.out.println(10%3);

        //（2）强制转换
        byte b1=10;
        byte b2=20;
        byte result=(byte)(b1+b2);//请看结论3,所以要用byte强转

        //（3）字符串的"+"操作：当"+"操作中出现字符串时，这个"+"就是字符串拼接符，而不是算数运算符
        //会将前后的数据进行拼接，并产生一个新的字符串。（最终产生的是一个字符串）
        int age=18,b4=82;
        String s1="小木曾雪莱";
        System.out.println(s1+age);
        // 连续进行加操作时，从左到右逐个执行
        System.out.println(age+b4+s1);
        System.out.println(s1+age+'岁');
        System.out.println(s1+"age"+'岁');

        //(4)字符的+操作
        //当字符+字符或字符+数字时，会把字符通过ASCALL码表查询到对应的数字再计算（a:97,A:65）
        System.out.println(1+'a');//98







    }
}
