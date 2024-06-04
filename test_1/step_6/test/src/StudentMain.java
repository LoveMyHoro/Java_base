public class StudentMain {
    public static void main(String[] args) {

        //1.初始化学生数组
        Student []Sarr=new Student[3];
        Student s1=new Student(1,"凯尔希",21);
        Student s2=new Student(2,"明日香",18);
        Student s3=new Student(3,"赫萝",15);
        Sarr[0]=s1;
        Sarr[1]=s2;
        Sarr[2]=s3;
        //2.创建新学生
        Student s4=new Student(4,"苇草",19);
        //3.唯一性判断
        int flag=Contains(Sarr,s4.getId());
        if(flag==1){
            System.out.println("id已存在，不用添加");
        }
        else{
            //4.判断数组
            int count=GetCount(Sarr);
            if(count==Sarr.length){
                System.out.println("已存满");
                //创建一个新数组，长度=老数组长度+1；
                //然后把老数组拷贝到新数组
                Student []newArr=CreatArr(Sarr);
                newArr[count]=s4;
                Sarr=newArr;
                printArr(newArr);
            }
            else {
                Sarr[count]=s4;
                printArr(Sarr);
            }
        }
        //4.删除索引
        int flag2=GetIndex(Sarr,4);
        if(flag2==1){
            System.out.println("删除成功！删除后的数组为：");
            printArr(Sarr);
        }
        else {
            System.out.println("删除失败！");
        }





    }

    public static int Contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    return 1;
            }
            }
        }
        return 0;
    }
    public static int GetCount(Student []arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                sum+=1;
            }
        }
        return sum;
    }
    public static Student[] CreatArr(Student []arr){
        Student []arr2=new Student[arr.length+10];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        return arr2;
    }
    public static void printArr(Student []arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                arr[i].show();
            }
        }
    }
    public static int GetIndex(Student []arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    for(int j=i;j< arr.length-1;j++){
                        arr[j]=arr[j+1];
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
