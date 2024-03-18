package PracticeProblems;

import java.util.Scanner;

public class fibonacciSeries {


     public static void main(String[] args) {

        System.out.println("enter a num: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;

            for(int i=0; i<n; i++){
                System.out.println(fib(i) + " ");
            }
        }

    public static int fib(int n) {

        if(n<=1) {
            return n;
        }else {

            return fib(n-1) + fib(n-2);
        }



    }


    }


