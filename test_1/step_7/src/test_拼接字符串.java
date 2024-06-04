public class test_拼接字符串 {
    public static void main(String[] args) {
        int []arr={1,2,3};
        String newarr=Join(arr);
        System.out.println(newarr);

    }
    public static String Join(int arr[]){
        if(arr==null){
            return "";
        }
        if(arr.length==0){
            return "[]";
        }
        String temp="";
        temp+="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                temp+=arr[i];
            }
            else{
                temp=temp+','+arr[i];
            }
        }
        temp+="]";
        return temp;
    }
}
