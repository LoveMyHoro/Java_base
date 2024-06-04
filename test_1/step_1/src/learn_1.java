public class learn_1 {//类名要与文件名保持一致
    //main方法，表示程序的主入口，代码运行从main方法的第一行逐行运行
    public static void main(String[] args){
        int a=1,b=2;
        //如果要定义long类型的变量，在数值后面要加一个L作为后缀
        long c=99999999999L;
        //如果要定义float类型的变量，在数值后面要加一个F作为后缀(double不需要)
        float d=10.1F;
        a+=1;
        //输出语句
        System.out.println(a+c);
        //"\t"是制表符,在打印时会把前面的字符串长度补齐到8，或是8的整数倍（让数据对齐）
        System.out.println("hello"+'\t'+"java");

    }
}
