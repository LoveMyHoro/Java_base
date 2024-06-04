public class 数组_2 {
    public static void main(String[] args) {
        //1.二维数组的初始化
        //(1)静态初始化
        //格式：数据类型 [][]数组名=new 数据类型[][]{{元素1,元素2},{元素3,元素4}}
        int [][]arr={
                {1,2,3},
                {4,5,6,7}
        };//这是简化格式
        //(2)动态初始化
        //格式：数据类型[][] 数组名==new 数据类型[m][n]

        //2.获取元素
        System.out.println(arr[0][2]);
        //3.二维数组遍历
        for (int i = 0; i < arr.length; i++) {
            //i：表示二维数组中每一个索引
            //arr[i]：表示二维数组中每一个一维数组的索引
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                //j：表示一维数组中的每一个元素
                System.out.print(arr[i][i1]+" ");
            }
            System.out.println();

        }
    }
}
