package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element using addAll method
        Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

        //Print Elements
        System.out.println("ArrayList Elements using addAll method : " +list);

        //Adding Elements using for Loop
        for (int i = 0; i <= 15; i++) {
            list.add(i);
        }

        //Print Elements
        System.out.println("ArrayList Elements using for loop: " +list);

    }
}
