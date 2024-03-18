package PracticeProblems;
import java.util.*;

public class ArrayOfRandomNums {

    public static void main(String[] args) {

        int[] a = new int[9];
        Random r = new Random();
        for(int i=0; i<a.length;i++){
            a[i] = r.nextInt(100);
        }
        for (int e:a) {
            System.out.println(e);


        }

    }
}
