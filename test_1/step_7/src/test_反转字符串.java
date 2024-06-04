public class test_反转字符串 {
        public static void main(String[] args) {
        String s1="abc";
        String s2=Invert(s1);
        System.out.println(s2);

    }
    public static String Invert(String arr){
        if(arr==null||arr.length()==0){
            return "";
        }
        String temp="";
        for (int i = arr.length()-1; i >=0; i--) {

            temp+=arr.charAt(i);
        }
        return temp;
    }
}
