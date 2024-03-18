package PracticeProblems;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac=1;
        for(int i=n; i>=1;i--){
            fac = fac * i;
        }
        System.out.println(fac);
    }
}
