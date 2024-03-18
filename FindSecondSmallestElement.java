package PracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindSecondSmallestElement {

        public static void main(String[] args) {
            int i;
            int[] arr = new int[5];
            System.out.println("Enter the array values: ");
            Scanner sc = new Scanner(System.in);
            for(i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
           for(i=0;i<arr.length;i++) {
               for (int j = i + 1; j < arr.length; j++) {
                   int a = 0;
                   if (arr[i] > arr[j]) {
                       a = arr[i];
                       arr[i] = arr[j];
                       arr[j] = a;
                   }
               }
           }


            System.out.println("Second Smallest Element is: "+ arr[1]);
        }
    }



