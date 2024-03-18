package PracticeProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOddNums {

    public static void main(String[] args) {
        int[] a = new int[6];
        ArrayList<Integer>ans = new ArrayList<>();

        int odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the values: ");
        for(int i=0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for (int i= 0; i<a.length;i++){
           if(a[i]%2!=0){
               ans.add(a[i]);
           }
        }
        if(ans.size()>0){
            System.out.println("Odd numbers found: Odd numbers are: ");
            for (int e:ans) {
                System.out.println(e);
            }
        }else{
            System.out.println("No odd numbers found");
        }
    }
}
