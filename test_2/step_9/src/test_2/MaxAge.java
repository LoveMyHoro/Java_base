package test_2;

import java.util.ArrayList;

public class MaxAge {
    private MaxAge(){

    }
    public static int Max(ArrayList<Student>list){
        if(list.size()==0){
            return -1;
        }
        int maxage=list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tempAge=list.get(i).getAge();
            if(tempAge>maxage){
                maxage=tempAge;
            }
        }
        return maxage;
    }
}
