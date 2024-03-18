package PracticeProblems;

import java.util.Scanner;

public class CheckIfPalindrome {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String temp = Integer.toString(n);
        int[] N = new int[temp.length()];
        int L = N.length;
        int cnt = 0;
        for(int i=0; i<temp.length();i++){

            N[i]=temp.charAt(i) - '0';
        }
        for(int j = 0; j<L/2;j++){
            for(int k=L-1;k>L/2;k--){
                if(N[j]==N[k]){
                  cnt++;
                }
            }
        }
        if(cnt==L/2){
            System.out.println("Given num is a Palindrome");
        }else{
            System.out.println("Given num is not a Palindrome");
        }

    }
}
