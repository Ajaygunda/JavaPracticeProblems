package PracticeProblems;
import java.lang.*;
import java.util.ArrayList;

public class PrintFirst10PrimeNums{

    public static void main (String[] args){
        ArrayList<Integer> p = new ArrayList<>();
        int n = 10;
        boolean isPrime;
        p.add(2);
        for (int i = 3; i < n; i+=2) {
            isPrime = true;
            for (Integer j : p) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                p.add(i);
            }
        }
        System.out.println(p);


        }



}
