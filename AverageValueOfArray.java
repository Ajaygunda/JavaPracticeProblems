package PracticeProblems;

import java.util.Scanner;

public class AverageValueOfArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        int sum=0;
        double avg=0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the values: ");
        for(int i=0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for (int e:a) {
            sum = sum+e;
        }
        avg = sum/a.length;
        System.out.println("sum: " + sum);
        System.out.println("Average: "+ avg);
    }
}
