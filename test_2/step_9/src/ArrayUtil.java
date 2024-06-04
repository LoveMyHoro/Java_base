public class ArrayUtil {
    private ArrayUtil(){

    }
    public static String printArr(int []arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i!=arr.length-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public static double getAverage(double[]arr){
        double aver=0;
        double sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        aver=sum/n;
        return aver;
    }

}
