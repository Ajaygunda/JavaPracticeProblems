package PracticeProblems;

import java.util.Scanner;

public class CalcPowerofNum {

    public static void main(String[] args) {
        int base;
        int power;
        int ans = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base num: ");
        base = sc.nextInt();
        System.out.println("Enter the power of base: ");
        power = sc.nextInt();

        for(int i=0;i<power;i++){

            ans = ans*base;
        }
        System.out.println(ans);

    }
}
