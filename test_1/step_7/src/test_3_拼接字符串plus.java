public class test_3_拼接字符串plus {
    public static void main(String[] args) {
        int []arr={1,2,3};
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        String s1=arrtostring(arr);
        System.out.println(s1);

    }
    public static String arrtostring(int []arr){
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }
            else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
