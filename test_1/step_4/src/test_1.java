import java.util.Random;

public class test_1{
    public static void main(String[] args) {
        Random r=new Random();
        int array[]={1,2,3,4,5};
        int i=0,j=array.length-1;
        while(i<=j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        for (int i1 = 0; i1 < array.length; i1++) {
            System.out.println(array[i1]);
        }

    }

        }