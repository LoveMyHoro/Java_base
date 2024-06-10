package Main;

import java.util.ArrayList;
import java.util.Random;

public  class CodeUtil {
    public static String GetCode(){
        ArrayList<Character> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            list.add((char)(i+'a'));
            list.add((char)(i+'A'));
        }
        Random r=new Random();
        for(int i=0;i<4;i++)
        {
            int temp=r.nextInt(list.size());
            sb.append(list.get(temp));

        }
        int Number=r.nextInt(10);
        sb.append(Number);
        char []arr=sb.toString().toCharArray();

        int RandomIndex=r.nextInt(arr.length);
        char Temp=arr[arr.length-1];
        arr[arr.length-1]=arr[RandomIndex];
        arr[RandomIndex]=Temp;

        return new String(arr);

    }
}
