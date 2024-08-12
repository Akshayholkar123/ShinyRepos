package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class RevNumArrWithoutLen {

    public static void main(String[] args) {
        int a[] = {2, 4, 7, 9, 1, 3, 10};
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int ele : a) {
            al.add(ele);
        }
        
        System.out.println(al.toString());
    }

}
